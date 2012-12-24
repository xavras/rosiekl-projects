/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iverbs;

import java.util.*;
import javax.microedition.io.file.*;
import javax.microedition.io.*;
import java.io.*;
/**
 *
 * @author Lukasz
 */
public class iVerbsEngine /** @version 1.3 */
{
    private Vector currentList = new Vector();
    private Vector wrongList = new Vector();
    private Vector rightList = new Vector();
    private Vector doneList = new Vector();
    
    private int indexOfCurrentMemo = -1;
    private int orderOfWords = iVerbsMemo.ORDER_HEAD;
    Random random = new Random();
    
    public iVerbsEngine()
    {
    }
    
    public void loadFile(String path)
    {
        /* READING DATA FROM FILE */
        final int BUFSIZE = 1024;
        String str = "";
        byte[] bufor = new byte[BUFSIZE];
        try 
        {
            FileConnection fc = (FileConnection)Connector.open(path, Connector.READ);
            InputStream is = fc.openInputStream();
            
            for(int chars = BUFSIZE; chars == BUFSIZE;)
            {
                chars = is.read(bufor, 0, BUFSIZE);
                str += new String(bufor, "UTF-16LE");
            }
            
        }
        catch (IOException ex)
        {
            str =  " >> " + ex.toString();
        }
        
        clearArrays();
        
        /* CREATE MEMOS FROM DATA */
        int pointer = 0;
        for(;;)
        {
            String first, second;
            int position = str.indexOf('@', pointer);
            if( position == -1 ) break;
            first = str.substring(pointer, position);
            
            pointer = position + 1;
            position = str.indexOf('\n', pointer);
            if(position == -1)//end of file
            {
                second = str.substring(pointer);
                iVerbsMemo tmp = new iVerbsMemo(first, second);
                currentList.addElement(tmp);
                break;
            }
            else//not an end of file
            {
                second = str.substring(pointer, position);
                iVerbsMemo tmp = new iVerbsMemo(first, second);
                currentList.addElement(tmp);
                pointer = position + 1;
            }
        }
        
        /* WE HAVE MEMOS */
        indexOfCurrentMemo = random.nextInt(currentList.size());
    }
    
    public boolean checkWord(int flag)/** @return is finished */
    {
        if(currentList.isEmpty()) return true;
        
        /* SET FLAG AND MOVE TO LIST */
        ((iVerbsMemo)currentList.elementAt(indexOfCurrentMemo)).setFlag(flag);
        if(flag == iVerbsMemo.DONE)
        {
            rightList.addElement(((iVerbsMemo)currentList.elementAt(indexOfCurrentMemo)));
            currentList.removeElementAt(indexOfCurrentMemo);
        }
        else if(flag == iVerbsMemo.TODO)
        {
            wrongList.addElement(((iVerbsMemo)currentList.elementAt(indexOfCurrentMemo)));
            currentList.removeElementAt(indexOfCurrentMemo);
        }
        
        if(currentList.isEmpty())
        {
            if(wrongList.isEmpty()) return true;
            else //copy wrong to current
            {
                Vector tmp = currentList;
                currentList = wrongList;
                wrongList = tmp;
            }
        }
        
        indexOfCurrentMemo = random.nextInt(currentList.size());
        return false;
    }
    
    public String getNextWord(int index)
    {
        return ((iVerbsMemo)currentList.elementAt(indexOfCurrentMemo)).getWord(index, orderOfWords);
    }

    public int getOrderOfWords() {
        return orderOfWords;
    }

    public void setOrderOfWords(int orderOfWords) {
        this.orderOfWords = orderOfWords;
    }
    
    private void clearArrays()/** clearing all of arrays */
    {
        currentList.removeAllElements();
        wrongList.removeAllElements();
        rightList.removeAllElements();
        doneList.removeAllElements();
    }
    
    public int getCurrentListSize()
    {
        return currentList.size();
    }
    
    public int getWrongListSize()
    {
        return wrongList.size();
    }
    
    public int getRightListSize()
    {
        return rightList.size();
    }
    
    public int getDoneListSize()
    {
        return doneList.size();
    }
    
    public boolean isFinished()
    {
        if(currentList.isEmpty()) return true;
        else return false;
    }
    
    public boolean isLoaded()
    {
        if(currentList.isEmpty() && doneList.isEmpty() && rightList.isEmpty() && wrongList.isEmpty()) return false;
        else return true;
            
    }
}
