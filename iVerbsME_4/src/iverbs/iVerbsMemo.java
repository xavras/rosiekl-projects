/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iverbs;

import java.util.*;

/**
 *
 * @author Lukasz
 */
public class iVerbsMemo /** @version 1.0 */
{
    public static final int DONE = 0;
    public static final int TODO = 1;
    
    public static final int ORDER_HEAD = 0;
    public static final int ORDER_TAIL = 1;
    
    private Vector words = new Vector();
    private int flag = TODO;
    
    public iVerbsMemo(String eng, String pol)
    {
        words.addElement(eng);
        words.addElement(pol);
    }
    
    public iVerbsMemo()
    {
    }
    
    public iVerbsMemo(Vector arrayOfWords)
    {
        words = arrayOfWords;
    }
    
    public String getFirst(int order)
    {
        if(order == ORDER_HEAD) return (String)(words.firstElement());
        else return (String)(words.lastElement());
    }
    
    public String getLast(int order)
    {
        if(order == ORDER_HEAD) return (String)(words.lastElement());
        else return (String)(words.firstElement());
    }
    
    public String getWord(int index, int order)
    {
        if(order == ORDER_HEAD) return (String)(words.elementAt(index));
        else return (String)(words.elementAt(words.size()-1-index));
    }
    
    public void setWord(int index, String newWord, int order)
    {
        if(order == ORDER_HEAD) words.setElementAt(newWord, index);
        else words.setElementAt(newWord, words.size()-index-1);
    }
    
    public void setFlag(int value)
    {
        flag = value;
    }
    
    public int getFlag()
    {
        return flag;
    }
}
