/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iverbs;

import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;
import org.netbeans.microedition.lcdui.SplashScreen;
import org.netbeans.microedition.lcdui.pda.FileBrowser;

/**
 * @author Lukasz
 * @version 1.8
 */
public class iVerbsMIDlet extends MIDlet implements CommandListener {

    private iVerbsEngine engine = new iVerbsEngine();
    private String path;
    private Canvas canvas;
    private boolean midletPaused = false;
    private int fontSize = Font.SIZE_MEDIUM;
    private int fontFace = Font.FACE_SYSTEM;
//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Command okAbout;
    private Command cancelFileBrowser;
    private Command backTest;
    private Command exitMenu;
    private Command backOpcje;
    private Command cancelKolejnoscSlowek;
    private Command okKolejnoscSlowek;
    private Command backCzcionka;
    private Command backRozmiarCzcionki;
    private Command okRozmiarCzcionki;
    private Command backFaceCzcionka;
    private Command okFaceCzcionka;
    private List menuGlowne;
    private List Opcje;
    private FileBrowser fileBrowser;
    private SplashScreen splashScreen;
    private List opcjeKolejnoscSlowek;
    private Form About;
    private StringItem stringItem1;
    private StringItem stringItem;
    private List Czcionka;
    private List rozmiarCzcionki;
    private List faceCzcionka;
    private Image splashImage;
//</editor-fold>//GEN-END:|fields|0|

    /**
     * The HelloMIDlet constructor.
     */
    public iVerbsMIDlet() {
    }

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|
//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initializes the application.
     * It is called only once when the MIDlet is started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
 
    }//GEN-BEGIN:|0-initialize|2|
//</editor-fold>//GEN-END:|0-initialize|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
        switchDisplayable(null, getSplashScreen());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
    }//GEN-BEGIN:|3-startMIDlet|2|
//</editor-fold>//GEN-END:|3-startMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
    }//GEN-BEGIN:|4-resumeMIDlet|2|
//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code> instance is taken from <code>getDisplay</code> method. This method is used by all actions in the design for switching displayable.
     * @param alert the Alert which is temporarily set to the display; if <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
//</editor-fold>//GEN-END:|5-switchDisplayable|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a particular displayable.
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == About) {//GEN-BEGIN:|7-commandAction|1|129-preAction
            if (command == okAbout) {//GEN-END:|7-commandAction|1|129-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenuGlowne());//GEN-LINE:|7-commandAction|2|129-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|3|141-preAction
        } else if (displayable == Czcionka) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|3|141-preAction
                // write pre-action user code here
                CzcionkaAction();//GEN-LINE:|7-commandAction|4|141-postAction
                // write post-action user code here
            } else if (command == backCzcionka) {//GEN-LINE:|7-commandAction|5|147-preAction
                // write pre-action user code here
                switchDisplayable(null, getOpcje());//GEN-LINE:|7-commandAction|6|147-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|7|55-preAction
        } else if (displayable == Opcje) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|7|55-preAction
                // write pre-action user code here
                OpcjeAction();//GEN-LINE:|7-commandAction|8|55-postAction
                // write post-action user code here
            } else if (command == backOpcje) {//GEN-LINE:|7-commandAction|9|61-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenuGlowne());//GEN-LINE:|7-commandAction|10|61-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|11|162-preAction
        } else if (displayable == faceCzcionka) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|11|162-preAction
                // write pre-action user code here
                faceCzcionkaAction();//GEN-LINE:|7-commandAction|12|162-postAction
                // write post-action user code here
            } else if (command == backFaceCzcionka) {//GEN-LINE:|7-commandAction|13|169-preAction
                // write pre-action user code here
                switchDisplayable(null, getCzcionka());//GEN-LINE:|7-commandAction|14|169-postAction
                // write post-action user code here
            } else if (command == okFaceCzcionka) {//GEN-LINE:|7-commandAction|15|171-preAction
                String selected = faceCzcionka.getString(faceCzcionka.getSelectedIndex());
                if(selected.equals("MONOSPACE")) fontFace = Font.FACE_MONOSPACE;
                else if(selected.equals("PROPORTIONAL")) fontFace = Font.FACE_PROPORTIONAL;
                else if(selected.equals("SYSTEM")) fontFace = Font.FACE_SYSTEM;
                switchDisplayable(null, getCzcionka());//GEN-LINE:|7-commandAction|16|171-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|17|72-preAction
        } else if (displayable == fileBrowser) {
            if (command == FileBrowser.SELECT_FILE_COMMAND) {//GEN-END:|7-commandAction|17|72-preAction
                //engine.loadFile(fileBrowser.getSelectedFileURL());
                //engine.loadFile("file:///memorycard/test.txt");
                path = fileBrowser.getSelectedFileURL();
                engine.loadFile(path);
                ((EngineCanvas)getCanvas()).setString1(engine.getNextWord(0));
                ((EngineCanvas)getCanvas()).setString2(null);
                switchDisplayable(null, getMenuGlowne());//GEN-LINE:|7-commandAction|18|72-postAction
                // write post-action user code here
            } else if (command == cancelFileBrowser) {//GEN-LINE:|7-commandAction|19|135-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenuGlowne());//GEN-LINE:|7-commandAction|20|135-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|21|40-preAction
        } else if (displayable == menuGlowne) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|21|40-preAction
                // write pre-action user code here
                menuGlowneAction();//GEN-LINE:|7-commandAction|22|40-postAction
                // write post-action user code here
            } else if (command == exitMenu) {//GEN-LINE:|7-commandAction|23|53-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|24|53-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|25|96-preAction
        } else if (displayable == opcjeKolejnoscSlowek) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|25|96-preAction
                // write pre-action user code here
                opcjeKolejnoscSlowekAction();//GEN-LINE:|7-commandAction|26|96-postAction
                // write post-action user code here
            } else if (command == cancelKolejnoscSlowek) {//GEN-LINE:|7-commandAction|27|104-preAction
                // write pre-action user code here
                switchDisplayable(null, getOpcje());//GEN-LINE:|7-commandAction|28|104-postAction
                // write post-action user code here
            } else if (command == okKolejnoscSlowek) {//GEN-LINE:|7-commandAction|29|102-preAction
                engine.setOrderOfWords(opcjeKolejnoscSlowek.getSelectedIndex());
                switchDisplayable(null, getOpcje());//GEN-LINE:|7-commandAction|30|102-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|31|150-preAction
        } else if (displayable == rozmiarCzcionki) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|31|150-preAction
                // write pre-action user code here
                rozmiarCzcionkiAction();//GEN-LINE:|7-commandAction|32|150-postAction
                // write post-action user code here
            } else if (command == backRozmiarCzcionki) {//GEN-LINE:|7-commandAction|33|156-preAction
                // write pre-action user code here
                switchDisplayable(null, getCzcionka());//GEN-LINE:|7-commandAction|34|156-postAction
                // write post-action user code here
            } else if (command == okRozmiarCzcionki) {//GEN-LINE:|7-commandAction|35|158-preAction
                String selected = rozmiarCzcionki.getString(rozmiarCzcionki.getSelectedIndex());
                if(selected.equals("Large")) fontSize = Font.SIZE_LARGE;
                else if(selected.equals("Medium")) fontSize = Font.SIZE_MEDIUM;
                else if(selected.equals("Small")) fontSize = Font.SIZE_SMALL;
                switchDisplayable(null, getCzcionka());//GEN-LINE:|7-commandAction|36|158-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|37|84-preAction
        } else if (displayable == splashScreen) {
            if (command == SplashScreen.DISMISS_COMMAND) {//GEN-END:|7-commandAction|37|84-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenuGlowne());//GEN-LINE:|7-commandAction|38|84-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|39|7-postCommandAction
        }//GEN-END:|7-commandAction|39|7-postCommandAction
        else if (displayable == canvas) {
            if (command == backTest) {
                switchDisplayable(null, getMenuGlowne());
            }
        }
    }//GEN-BEGIN:|7-commandAction|40|
//</editor-fold>//GEN-END:|7-commandAction|40|

    private Canvas getCanvas() {
        if (canvas == null) {
            canvas = new EngineCanvas();
            canvas.addCommand(getBackTest());
            canvas.setCommandListener(this);
        }
        return canvas;
    }

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backTest ">//GEN-BEGIN:|28-getter|0|28-preInit
    /**
     * Returns an initiliazed instance of backTest component.
     * @return the initialized component instance
     */
    public Command getBackTest() {
        if (backTest == null) {//GEN-END:|28-getter|0|28-preInit
            // write pre-init user code here
            backTest = new Command("Menu", Command.BACK, 0);//GEN-LINE:|28-getter|1|28-postInit
            // write post-init user code here
        }//GEN-BEGIN:|28-getter|2|
        return backTest;
    }
//</editor-fold>//GEN-END:|28-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: menuGlowne ">//GEN-BEGIN:|38-getter|0|38-preInit
    /**
     * Returns an initiliazed instance of menuGlowne component.
     * @return the initialized component instance
     */
    public List getMenuGlowne() {
        if (menuGlowne == null) {//GEN-END:|38-getter|0|38-preInit
            // write pre-init user code here
            menuGlowne = new List("Menu", Choice.IMPLICIT);//GEN-BEGIN:|38-getter|1|38-postInit
            menuGlowne.append("Test", null);
            menuGlowne.append("Wyb\u00F3r Pliku", null);
            menuGlowne.append("Opcje", null);
            menuGlowne.append("O programie", null);
            menuGlowne.addCommand(getExitMenu());
            menuGlowne.setCommandListener(this);
            menuGlowne.setSelectedFlags(new boolean[]{false, false, false, false});//GEN-END:|38-getter|1|38-postInit
            // write post-init user code here
        }//GEN-BEGIN:|38-getter|2|
        return menuGlowne;
    }
//</editor-fold>//GEN-END:|38-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: menuGlowneAction ">//GEN-BEGIN:|38-action|0|38-preAction
    /**
     * Performs an action assigned to the selected list element in the menuGlowne component.
     */
    public void menuGlowneAction() {//GEN-END:|38-action|0|38-preAction
        // enter pre-action user code here
        String __selectedString = getMenuGlowne().getString(getMenuGlowne().getSelectedIndex());//GEN-BEGIN:|38-action|1|50-preAction
        if (__selectedString != null) {
            if (__selectedString.equals("Test")) {//GEN-END:|38-action|1|50-preAction
                switchDisplayable(null, getCanvas());
//GEN-LINE:|38-action|2|50-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Wyb\u00F3r Pliku")) {//GEN-LINE:|38-action|3|75-preAction
                // write pre-action user code here
                switchDisplayable(null, getFileBrowser());//GEN-LINE:|38-action|4|75-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Opcje")) {//GEN-LINE:|38-action|5|51-preAction
                // write pre-action user code here
                switchDisplayable(null, getOpcje());//GEN-LINE:|38-action|6|51-postAction
                // write post-action user code here
            } else if (__selectedString.equals("O programie")) {//GEN-LINE:|38-action|7|112-preAction
                // write pre-action user code here
                switchDisplayable(null, getAbout());//GEN-LINE:|38-action|8|112-postAction
                // write post-action user code here
            }//GEN-BEGIN:|38-action|9|38-postAction
        }//GEN-END:|38-action|9|38-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|38-action|10|
//</editor-fold>//GEN-END:|38-action|10|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitMenu ">//GEN-BEGIN:|52-getter|0|52-preInit
    /**
     * Returns an initiliazed instance of exitMenu component.
     * @return the initialized component instance
     */
    public Command getExitMenu() {
        if (exitMenu == null) {//GEN-END:|52-getter|0|52-preInit
            // write pre-init user code here
            exitMenu = new Command("Wyj\u015Bcie", Command.EXIT, 0);//GEN-LINE:|52-getter|1|52-postInit
            // write post-init user code here
        }//GEN-BEGIN:|52-getter|2|
        return exitMenu;
    }
//</editor-fold>//GEN-END:|52-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: Opcje ">//GEN-BEGIN:|54-getter|0|54-preInit
    /**
     * Returns an initiliazed instance of Opcje component.
     * @return the initialized component instance
     */
    public List getOpcje() {
        if (Opcje == null) {//GEN-END:|54-getter|0|54-preInit
            // write pre-init user code here
            Opcje = new List("Opcje", Choice.IMPLICIT);//GEN-BEGIN:|54-getter|1|54-postInit
            Opcje.append("Kolejno\u015B\u0107 s\u0142\u00F3wek", null);
            Opcje.append("Czcionka", null);
            Opcje.addCommand(getBackOpcje());
            Opcje.setCommandListener(this);
            Opcje.setSelectedFlags(new boolean[]{false, false});//GEN-END:|54-getter|1|54-postInit
            // write post-init user code here
        }//GEN-BEGIN:|54-getter|2|
        return Opcje;
    }
//</editor-fold>//GEN-END:|54-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: OpcjeAction ">//GEN-BEGIN:|54-action|0|54-preAction
    /**
     * Performs an action assigned to the selected list element in the Opcje component.
     */
    public void OpcjeAction() {//GEN-END:|54-action|0|54-preAction
        // enter pre-action user code here
        String __selectedString = getOpcje().getString(getOpcje().getSelectedIndex());//GEN-BEGIN:|54-action|1|94-preAction
        if (__selectedString != null) {
            if (__selectedString.equals("Kolejno\u015B\u0107 s\u0142\u00F3wek")) {//GEN-END:|54-action|1|94-preAction
                // write pre-action user code here
                switchDisplayable(null, getOpcjeKolejnoscSlowek());//GEN-LINE:|54-action|2|94-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Czcionka")) {//GEN-LINE:|54-action|3|139-preAction
                // write pre-action user code here
                switchDisplayable(null, getCzcionka());//GEN-LINE:|54-action|4|139-postAction
                // write post-action user code here
            }//GEN-BEGIN:|54-action|5|54-postAction
        }//GEN-END:|54-action|5|54-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|54-action|6|
//</editor-fold>//GEN-END:|54-action|6|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backOpcje ">//GEN-BEGIN:|60-getter|0|60-preInit
    /**
     * Returns an initiliazed instance of backOpcje component.
     * @return the initialized component instance
     */
    public Command getBackOpcje() {
        if (backOpcje == null) {//GEN-END:|60-getter|0|60-preInit
            // write pre-init user code here
            backOpcje = new Command("Powr\u00F3t", Command.BACK, 0);//GEN-LINE:|60-getter|1|60-postInit
            // write post-init user code here
        }//GEN-BEGIN:|60-getter|2|
        return backOpcje;
    }
//</editor-fold>//GEN-END:|60-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: fileBrowser ">//GEN-BEGIN:|70-getter|0|70-preInit
    /**
     * Returns an initiliazed instance of fileBrowser component.
     * @return the initialized component instance
     */
    public FileBrowser getFileBrowser() {
        if (fileBrowser == null) {//GEN-END:|70-getter|0|70-preInit
            // write pre-init user code here
            fileBrowser = new FileBrowser(getDisplay());//GEN-BEGIN:|70-getter|1|70-postInit
            fileBrowser.setTitle("Wybierz Plik");
            fileBrowser.setCommandListener(this);
            fileBrowser.addCommand(FileBrowser.SELECT_FILE_COMMAND);
            fileBrowser.addCommand(getCancelFileBrowser());//GEN-END:|70-getter|1|70-postInit
            // write post-init user code here
        }//GEN-BEGIN:|70-getter|2|
        return fileBrowser;
    }
//</editor-fold>//GEN-END:|70-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: splashScreen ">//GEN-BEGIN:|82-getter|0|82-preInit
    /**
     * Returns an initiliazed instance of splashScreen component.
     * @return the initialized component instance
     */
    public SplashScreen getSplashScreen() {
        if (splashScreen == null) {//GEN-END:|82-getter|0|82-preInit
            // write pre-init user code here
            splashScreen = new SplashScreen(getDisplay());//GEN-BEGIN:|82-getter|1|82-postInit
            splashScreen.setTitle("splashScreen");
            splashScreen.setCommandListener(this);
            splashScreen.setFullScreenMode(true);
            splashScreen.setImage(getSplashImage());
            splashScreen.setTimeout(1000);//GEN-END:|82-getter|1|82-postInit
            // write post-init user code here
        }//GEN-BEGIN:|82-getter|2|
        return splashScreen;
    }
//</editor-fold>//GEN-END:|82-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: splashImage ">//GEN-BEGIN:|86-getter|0|86-preInit
    /**
     * Returns an initiliazed instance of splashImage component.
     * @return the initialized component instance
     */
    public Image getSplashImage() {
        if (splashImage == null) {//GEN-END:|86-getter|0|86-preInit
            // write pre-init user code here
            try {//GEN-BEGIN:|86-getter|1|86-@java.io.IOException
                splashImage = Image.createImage("/iVerbs_splash.png");
            } catch (java.io.IOException e) {//GEN-END:|86-getter|1|86-@java.io.IOException
                e.printStackTrace();
            }//GEN-LINE:|86-getter|2|86-postInit
            // write post-init user code here
        }//GEN-BEGIN:|86-getter|3|
        return splashImage;
    }
//</editor-fold>//GEN-END:|86-getter|3|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: opcjeKolejnoscSlowek ">//GEN-BEGIN:|95-getter|0|95-preInit
    /**
     * Returns an initiliazed instance of opcjeKolejnoscSlowek component.
     * @return the initialized component instance
     */
    public List getOpcjeKolejnoscSlowek() {
        if (opcjeKolejnoscSlowek == null) {//GEN-END:|95-getter|0|95-preInit
            // write pre-init user code here
            opcjeKolejnoscSlowek = new List("Kolejno\u015B\u0107 S\u0142\u00F3wek", Choice.EXCLUSIVE);//GEN-BEGIN:|95-getter|1|95-postInit
            opcjeKolejnoscSlowek.append("ang -> pol", null);
            opcjeKolejnoscSlowek.append("pol -> ang", null);
            opcjeKolejnoscSlowek.addCommand(getOkKolejnoscSlowek());
            opcjeKolejnoscSlowek.addCommand(getCancelKolejnoscSlowek());
            opcjeKolejnoscSlowek.setCommandListener(this);
            opcjeKolejnoscSlowek.setSelectedFlags(new boolean[]{false, false});//GEN-END:|95-getter|1|95-postInit
            // write post-init user code here
        }//GEN-BEGIN:|95-getter|2|
        return opcjeKolejnoscSlowek;
    }
//</editor-fold>//GEN-END:|95-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: opcjeKolejnoscSlowekAction ">//GEN-BEGIN:|95-action|0|95-preAction
    /**
     * Performs an action assigned to the selected list element in the opcjeKolejnoscSlowek component.
     */
    public void opcjeKolejnoscSlowekAction() {//GEN-END:|95-action|0|95-preAction
        // enter pre-action user code here
        String __selectedString = getOpcjeKolejnoscSlowek().getString(getOpcjeKolejnoscSlowek().getSelectedIndex());//GEN-BEGIN:|95-action|1|99-preAction
        if (__selectedString != null) {
            if (__selectedString.equals("ang -> pol")) {//GEN-END:|95-action|1|99-preAction
                // write pre-action user code here
//GEN-LINE:|95-action|2|99-postAction
                // write post-action user code here
            } else if (__selectedString.equals("pol -> ang")) {//GEN-LINE:|95-action|3|100-preAction
                // write pre-action user code here
//GEN-LINE:|95-action|4|100-postAction
                // write post-action user code here
            }//GEN-BEGIN:|95-action|5|95-postAction
        }//GEN-END:|95-action|5|95-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|95-action|6|
//</editor-fold>//GEN-END:|95-action|6|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okKolejnoscSlowek ">//GEN-BEGIN:|101-getter|0|101-preInit
    /**
     * Returns an initiliazed instance of okKolejnoscSlowek component.
     * @return the initialized component instance
     */
    public Command getOkKolejnoscSlowek() {
        if (okKolejnoscSlowek == null) {//GEN-END:|101-getter|0|101-preInit
            // write pre-init user code here
            okKolejnoscSlowek = new Command("OK", Command.OK, 0);//GEN-LINE:|101-getter|1|101-postInit
            // write post-init user code here
        }//GEN-BEGIN:|101-getter|2|
        return okKolejnoscSlowek;
    }
//</editor-fold>//GEN-END:|101-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: cancelKolejnoscSlowek ">//GEN-BEGIN:|103-getter|0|103-preInit
    /**
     * Returns an initiliazed instance of cancelKolejnoscSlowek component.
     * @return the initialized component instance
     */
    public Command getCancelKolejnoscSlowek() {
        if (cancelKolejnoscSlowek == null) {//GEN-END:|103-getter|0|103-preInit
            // write pre-init user code here
            cancelKolejnoscSlowek = new Command("Anuluj", Command.CANCEL, 0);//GEN-LINE:|103-getter|1|103-postInit
            // write post-init user code here
        }//GEN-BEGIN:|103-getter|2|
        return cancelKolejnoscSlowek;
    }
//</editor-fold>//GEN-END:|103-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okAbout ">//GEN-BEGIN:|128-getter|0|128-preInit
    /**
     * Returns an initiliazed instance of okAbout component.
     * @return the initialized component instance
     */
    public Command getOkAbout() {
        if (okAbout == null) {//GEN-END:|128-getter|0|128-preInit
            // write pre-init user code here
            okAbout = new Command("OK", Command.OK, 0);//GEN-LINE:|128-getter|1|128-postInit
            // write post-init user code here
        }//GEN-BEGIN:|128-getter|2|
        return okAbout;
    }
//</editor-fold>//GEN-END:|128-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: About ">//GEN-BEGIN:|127-getter|0|127-preInit
    /**
     * Returns an initiliazed instance of About component.
     * @return the initialized component instance
     */
    public Form getAbout() {
        if (About == null) {//GEN-END:|127-getter|0|127-preInit
            // write pre-init user code here
            About = new Form("About", new Item[]{getStringItem(), getStringItem1()});//GEN-BEGIN:|127-getter|1|127-postInit
            About.addCommand(getOkAbout());
            About.setCommandListener(this);//GEN-END:|127-getter|1|127-postInit
            // write post-init user code here
        }//GEN-BEGIN:|127-getter|2|
        return About;
    }
//</editor-fold>//GEN-END:|127-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem ">//GEN-BEGIN:|130-getter|0|130-preInit
    /**
     * Returns an initiliazed instance of stringItem component.
     * @return the initialized component instance
     */
    public StringItem getStringItem() {
        if (stringItem == null) {//GEN-END:|130-getter|0|130-preInit
            // write pre-init user code here
            stringItem = new StringItem("", "iVerbs 1.8", Item.PLAIN);//GEN-BEGIN:|130-getter|1|130-postInit
            stringItem.setLayout(ImageItem.LAYOUT_CENTER | Item.LAYOUT_TOP | Item.LAYOUT_BOTTOM | Item.LAYOUT_VCENTER | ImageItem.LAYOUT_NEWLINE_AFTER);
            stringItem.setPreferredSize(-1, -1);//GEN-END:|130-getter|1|130-postInit
            // write post-init user code here
        }//GEN-BEGIN:|130-getter|2|
        return stringItem;
    }
//</editor-fold>//GEN-END:|130-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem1 ">//GEN-BEGIN:|131-getter|0|131-preInit
    /**
     * Returns an initiliazed instance of stringItem1 component.
     * @return the initialized component instance
     */
    public StringItem getStringItem1() {
        if (stringItem1 == null) {//GEN-END:|131-getter|0|131-preInit
            // write pre-init user code here
            stringItem1 = new StringItem("", "autor: \u0141ukasz Rosiek");//GEN-BEGIN:|131-getter|1|131-postInit
            stringItem1.setLayout(ImageItem.LAYOUT_CENTER | Item.LAYOUT_TOP | Item.LAYOUT_BOTTOM | Item.LAYOUT_VCENTER | ImageItem.LAYOUT_NEWLINE_AFTER);//GEN-END:|131-getter|1|131-postInit
            // write post-init user code here
        }//GEN-BEGIN:|131-getter|2|
        return stringItem1;
    }
//</editor-fold>//GEN-END:|131-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: cancelFileBrowser ">//GEN-BEGIN:|134-getter|0|134-preInit
    /**
     * Returns an initiliazed instance of cancelFileBrowser component.
     * @return the initialized component instance
     */
    public Command getCancelFileBrowser() {
        if (cancelFileBrowser == null) {//GEN-END:|134-getter|0|134-preInit
            // write pre-init user code here
            cancelFileBrowser = new Command("Anuluj", Command.CANCEL, 0);//GEN-LINE:|134-getter|1|134-postInit
            // write post-init user code here
        }//GEN-BEGIN:|134-getter|2|
        return cancelFileBrowser;
    }
//</editor-fold>//GEN-END:|134-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCzcionka ">//GEN-BEGIN:|146-getter|0|146-preInit
    /**
     * Returns an initiliazed instance of backCzcionka component.
     * @return the initialized component instance
     */
    public Command getBackCzcionka() {
        if (backCzcionka == null) {//GEN-END:|146-getter|0|146-preInit
            // write pre-init user code here
            backCzcionka = new Command("Back", Command.BACK, 0);//GEN-LINE:|146-getter|1|146-postInit
            // write post-init user code here
        }//GEN-BEGIN:|146-getter|2|
        return backCzcionka;
    }
//</editor-fold>//GEN-END:|146-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: Czcionka ">//GEN-BEGIN:|140-getter|0|140-preInit
    /**
     * Returns an initiliazed instance of Czcionka component.
     * @return the initialized component instance
     */
    public List getCzcionka() {
        if (Czcionka == null) {//GEN-END:|140-getter|0|140-preInit
            // write pre-init user code here
            Czcionka = new List("Czcionka", Choice.IMPLICIT);//GEN-BEGIN:|140-getter|1|140-postInit
            Czcionka.append("Rozmiar", null);
            Czcionka.append("Rodzaj", null);
            Czcionka.addCommand(getBackCzcionka());
            Czcionka.setCommandListener(this);
            Czcionka.setFitPolicy(Choice.TEXT_WRAP_DEFAULT);
            Czcionka.setSelectedFlags(new boolean[]{false, false});//GEN-END:|140-getter|1|140-postInit
            // write post-init user code here
        }//GEN-BEGIN:|140-getter|2|
        return Czcionka;
    }
//</editor-fold>//GEN-END:|140-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: CzcionkaAction ">//GEN-BEGIN:|140-action|0|140-preAction
    /**
     * Performs an action assigned to the selected list element in the Czcionka component.
     */
    public void CzcionkaAction() {//GEN-END:|140-action|0|140-preAction
        // enter pre-action user code here
        switch (getCzcionka().getSelectedIndex()) {//GEN-BEGIN:|140-action|1|143-preAction
            case 0://GEN-END:|140-action|1|143-preAction
                // write pre-action user code here
                switchDisplayable(null, getRozmiarCzcionki());//GEN-LINE:|140-action|2|143-postAction
                // write post-action user code here
                break;//GEN-BEGIN:|140-action|3|144-preAction
            case 1://GEN-END:|140-action|3|144-preAction
                // write pre-action user code here
                switchDisplayable(null, getFaceCzcionka());//GEN-LINE:|140-action|4|144-postAction
                // write post-action user code here
                break;//GEN-BEGIN:|140-action|5|140-postAction
        }//GEN-END:|140-action|5|140-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|140-action|6|
//</editor-fold>//GEN-END:|140-action|6|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: rozmiarCzcionki ">//GEN-BEGIN:|149-getter|0|149-preInit
    /**
     * Returns an initiliazed instance of rozmiarCzcionki component.
     * @return the initialized component instance
     */
    public List getRozmiarCzcionki() {
        if (rozmiarCzcionki == null) {//GEN-END:|149-getter|0|149-preInit
            // write pre-init user code here
            rozmiarCzcionki = new List("Rozmiar Czcionki", Choice.EXCLUSIVE);//GEN-BEGIN:|149-getter|1|149-postInit
            rozmiarCzcionki.append("Large", null);
            rozmiarCzcionki.append("Medium", null);
            rozmiarCzcionki.append("Small", null);
            rozmiarCzcionki.addCommand(getBackRozmiarCzcionki());
            rozmiarCzcionki.addCommand(getOkRozmiarCzcionki());
            rozmiarCzcionki.setCommandListener(this);
            rozmiarCzcionki.setSelectedFlags(new boolean[]{false, true, false});//GEN-END:|149-getter|1|149-postInit
            // write post-init user code here
        }//GEN-BEGIN:|149-getter|2|
        return rozmiarCzcionki;
    }
//</editor-fold>//GEN-END:|149-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: rozmiarCzcionkiAction ">//GEN-BEGIN:|149-action|0|149-preAction
    /**
     * Performs an action assigned to the selected list element in the rozmiarCzcionki component.
     */
    public void rozmiarCzcionkiAction() {//GEN-END:|149-action|0|149-preAction
        // enter pre-action user code here
        String __selectedString = getRozmiarCzcionki().getString(getRozmiarCzcionki().getSelectedIndex());//GEN-BEGIN:|149-action|1|152-preAction
        if (__selectedString != null) {
            if (__selectedString.equals("Large")) {//GEN-END:|149-action|1|152-preAction
                // write pre-action user code here
//GEN-LINE:|149-action|2|152-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Medium")) {//GEN-LINE:|149-action|3|153-preAction
                // write pre-action user code here
//GEN-LINE:|149-action|4|153-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Small")) {//GEN-LINE:|149-action|5|154-preAction
                // write pre-action user code here
//GEN-LINE:|149-action|6|154-postAction
                // write post-action user code here
            }//GEN-BEGIN:|149-action|7|149-postAction
        }//GEN-END:|149-action|7|149-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|149-action|8|
//</editor-fold>//GEN-END:|149-action|8|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backRozmiarCzcionki ">//GEN-BEGIN:|155-getter|0|155-preInit
    /**
     * Returns an initiliazed instance of backRozmiarCzcionki component.
     * @return the initialized component instance
     */
    public Command getBackRozmiarCzcionki() {
        if (backRozmiarCzcionki == null) {//GEN-END:|155-getter|0|155-preInit
            // write pre-init user code here
            backRozmiarCzcionki = new Command("Back", Command.BACK, 0);//GEN-LINE:|155-getter|1|155-postInit
            // write post-init user code here
        }//GEN-BEGIN:|155-getter|2|
        return backRozmiarCzcionki;
    }
//</editor-fold>//GEN-END:|155-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okRozmiarCzcionki ">//GEN-BEGIN:|157-getter|0|157-preInit
    /**
     * Returns an initiliazed instance of okRozmiarCzcionki component.
     * @return the initialized component instance
     */
    public Command getOkRozmiarCzcionki() {
        if (okRozmiarCzcionki == null) {//GEN-END:|157-getter|0|157-preInit
            // write pre-init user code here
            okRozmiarCzcionki = new Command("Ok", Command.OK, 0);//GEN-LINE:|157-getter|1|157-postInit
            // write post-init user code here
        }//GEN-BEGIN:|157-getter|2|
        return okRozmiarCzcionki;
    }
//</editor-fold>//GEN-END:|157-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backFaceCzcionka ">//GEN-BEGIN:|168-getter|0|168-preInit
    /**
     * Returns an initiliazed instance of backFaceCzcionka component.
     * @return the initialized component instance
     */
    public Command getBackFaceCzcionka() {
        if (backFaceCzcionka == null) {//GEN-END:|168-getter|0|168-preInit
            // write pre-init user code here
            backFaceCzcionka = new Command("Back", Command.BACK, 0);//GEN-LINE:|168-getter|1|168-postInit
            // write post-init user code here
        }//GEN-BEGIN:|168-getter|2|
        return backFaceCzcionka;
    }
//</editor-fold>//GEN-END:|168-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okFaceCzcionka ">//GEN-BEGIN:|170-getter|0|170-preInit
    /**
     * Returns an initiliazed instance of okFaceCzcionka component.
     * @return the initialized component instance
     */
    public Command getOkFaceCzcionka() {
        if (okFaceCzcionka == null) {//GEN-END:|170-getter|0|170-preInit
            // write pre-init user code here
            okFaceCzcionka = new Command("Ok", Command.OK, 0);//GEN-LINE:|170-getter|1|170-postInit
            // write post-init user code here
        }//GEN-BEGIN:|170-getter|2|
        return okFaceCzcionka;
    }
//</editor-fold>//GEN-END:|170-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: faceCzcionka ">//GEN-BEGIN:|161-getter|0|161-preInit
    /**
     * Returns an initiliazed instance of faceCzcionka component.
     * @return the initialized component instance
     */
    public List getFaceCzcionka() {
        if (faceCzcionka == null) {//GEN-END:|161-getter|0|161-preInit
            // write pre-init user code here
            faceCzcionka = new List("Rodzaj Czcionki", Choice.EXCLUSIVE);//GEN-BEGIN:|161-getter|1|161-postInit
            faceCzcionka.append("MONOSPACE", null);
            faceCzcionka.append("PROPORTIONAL", null);
            faceCzcionka.append("SYSTEM", null);
            faceCzcionka.addCommand(getBackFaceCzcionka());
            faceCzcionka.addCommand(getOkFaceCzcionka());
            faceCzcionka.setCommandListener(this);
            faceCzcionka.setSelectedFlags(new boolean[]{false, false, true});//GEN-END:|161-getter|1|161-postInit
            // write post-init user code here
        }//GEN-BEGIN:|161-getter|2|
        return faceCzcionka;
    }
//</editor-fold>//GEN-END:|161-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: faceCzcionkaAction ">//GEN-BEGIN:|161-action|0|161-preAction
    /**
     * Performs an action assigned to the selected list element in the faceCzcionka component.
     */
    public void faceCzcionkaAction() {//GEN-END:|161-action|0|161-preAction
        // enter pre-action user code here
        String __selectedString = getFaceCzcionka().getString(getFaceCzcionka().getSelectedIndex());//GEN-BEGIN:|161-action|1|165-preAction
        if (__selectedString != null) {
            if (__selectedString.equals("MONOSPACE")) {//GEN-END:|161-action|1|165-preAction
                // write pre-action user code here
//GEN-LINE:|161-action|2|165-postAction
                // write post-action user code here
            } else if (__selectedString.equals("PROPORTIONAL")) {//GEN-LINE:|161-action|3|166-preAction
                // write pre-action user code here
//GEN-LINE:|161-action|4|166-postAction
                // write post-action user code here
            } else if (__selectedString.equals("SYSTEM")) {//GEN-LINE:|161-action|5|167-preAction
                // write pre-action user code here
//GEN-LINE:|161-action|6|167-postAction
                // write post-action user code here
            }//GEN-BEGIN:|161-action|7|161-postAction
        }//GEN-END:|161-action|7|161-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|161-action|8|
//</editor-fold>//GEN-END:|161-action|8|

    /**
     * Returns a display instance.
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started.
     * Checks whether the MIDlet have been already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     * @param unconditional if true, then the MIDlet has to be unconditionally terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }

    /*****************************************************************
     * Engine Canvas
     * klasa obsługująca rysowanie w teście
     * 
     */
    public class EngineCanvas extends Canvas implements CommandListener {
        String string1 = "Wczytaj najpierw plik.";
        String string2 = null;
        int numDone, numRight, numWrong, numCurrent;
        
        protected void paint(Graphics g) {
            Font font_text = Font.getFont(fontFace, Font.STYLE_PLAIN, fontSize);
            //g.setFont(Font.getFont(fontFace, Font.STYLE_PLAIN, fontSize));
            updateStrings();//because of order changing
            g.setColor(255, 255, 255);
            int color = 0x000000;
            g.fillRect(0, 0, getWidth(), getHeight());
            //g.setColor(0, 0, 0);
            //g.drawString(string1, 5, 5, Graphics.TOP | Graphics.LEFT);
            drawString(g, string1, 5, 5, getWidth(), (int)(getHeight()*0.4),
                    Graphics.TOP | Graphics.LEFT, font_text, color);
            //g.drawString(string2, 5, (int)(getHeight()*0.4+5), Graphics.TOP | Graphics.LEFT);
            if(string2 != null) drawString(g, string2, 5, (int)(getHeight()*0.4+5), getWidth(), (int)(getHeight()*0.8),
                    Graphics.TOP | Graphics.LEFT, font_text, color);
            String stats = "";
            stats+=engine.getRightListSize()+"/";
            stats+=engine.getWrongListSize()+"/";
            stats+=engine.getCurrentListSize()+"/";
            stats+=engine.getDoneListSize();
            g.drawString(stats, 5, (int)(getHeight()*0.8+5), Graphics.TOP | Graphics.LEFT);
            g.setFont(Font.getFont(fontFace, Font.STYLE_PLAIN, fontSize));
            g.drawString("s"+g.getFont().getSize()+"f"+g.getFont().getFace()+"Ó"+(int)'Ó'+"ó"+(int)'ó', 
                    5, (int)(getHeight()*0.6+5), Graphics.TOP | Graphics.LEFT);
        }

        public void commandAction(Command c, Displayable d) {
            switchDisplayable(null, getMenuGlowne());
        }

        protected void keyPressed(int keyCode) {
            boolean end = engine.isFinished();

            if(!end) switch(getGameAction(keyCode))
            {
                case RIGHT://dalej
                    if(string2 == null){
                        string2 = engine.getNextWord(1);
                    }
                    break;
                case UP://dobrze
                    if(string2 != null){
                        end = engine.checkWord(iVerbsMemo.DONE);
                        if(end == false) string1 = engine.getNextWord(0);
                        string2 = null;
                    }
                    break;
                case DOWN://źle
                    if(string2 != null){
                        end = engine.checkWord(iVerbsMemo.TODO);
                        if(end == false) string1 = engine.getNextWord(0);
                        string2 = null;
                    }
                    break;
                default:
            }
            
            if ((end == true) && engine.isLoaded())
            {
                string1 = "Koniec sprawdzania."; 
            }
            
            repaint();
        }

        public void setString1(String string1) {
            this.string1 = string1;
        }
        
        public void setString2(String string2) {
            this.string2 = string2;
        }
        
        private void updateStrings()
        {
            if(!engine.isFinished() && engine.isLoaded())
            {
                if(string1 != null) string1 = engine.getNextWord(0);
                if(string2 != null) string2 = engine.getNextWord(1);
            }
        }
        
        /*private void drawString(Graphics g, String text, 
                int left, int up, int right, int down, //box to draw text inside 
                int style, Font font, int color)
        {
            String bufor;
            int start = 0, end = 0, tmp_end = 0;
            int x = left, y = up;
            char[] breakers = {' ', ',', '.', '/', '\\', ';',};
            int maxWidth = right - left;
            
            g.setFont(font);
            g.setColor(color);
                    
            for(;;)//Y
            {
                if(y+font.getHeight() > down)
                {
                    break;
                }
                
                for(;;)
                {
                    if(end >= text.length()-1)//koniec pliku
                    {
                        bufor = text.substring(start, end);
                        g.drawString(bufor, x, y, style);
                        break;
                    }
                        
                    tmp_end = stringFirstOf(text, breakers, end);
                    if(tmp_end == -1)//koniec pliku
                    {
                        tmp_end = text.length()-1;
                    }
                    //mamy info o wyrazie
                    tmp_end++;//bierzemy też ten podziałek
                    
                    bufor = text.substring(start, tmp_end);
                    int width = font.stringWidth(bufor);//dlugosc do sprawdzenia
                    
                    if(width < maxWidth)//zmiesci sie
                    {
                        end = tmp_end;
                    }
                    else//nie zmiesci sie
                    {
                        if(start == end)//jedno slowo jest dluzsze
                        {
                            end = divideString(bufor, font, maxWidth);
                        }
                        
                        //slowo sie nie zmiesci, rysujemy
                        bufor = text.substring(start, end);
                        g.drawString(bufor, x, y, style);
                        
                        y+=font.getHeight();
                        start = end;
                    }
                }
                
                if(end >= text.length()-1) break;
            }
        }*/
        
        private void drawString(Graphics g, String text, 
                int left, int top, int right, int down, //box to draw text inside 
                int style, Font font, int color)
        {
            int start = 0;
            int end = 0;
            int maxWidth = right - left;
            int y = top;
            g.setFont(font);
            g.setColor(color);

            for(;;)
            {           
                if(y+font.getHeight() > down)
                {
                    break;
                }
                
                if(end == text.length()-1)
                {
                    g.drawString(text.substring(start), left, y, style);
                    break;
                }
            
                if(font.substringWidth(text, start, end-start+1) > maxWidth)
                {
                    g.drawString(text.substring(start, end), left, y, style);
                    start = end;
                    y+=font.getHeight();
                }
                
                end++;
            }
        }
        
        private int stringFirstOf(String where, char[] what, int offset)
        {
            if(where.length() >= offset) return -1;
            int pos = -1;
            for(int i=0; i<what.length; i++)
            {
                int tmp = where.indexOf(what[i], offset);
                if(tmp == -1) continue;
                else if(pos == -1) pos = tmp;
                else if(pos > tmp) pos = tmp;
            }
            
            return pos;
        }
        
        private int divideString(String word, Font font, int maxWidth)
        {
            int end = 0;
            
            for(int i=0; i<word.length(); i++)
            {
                if(font.substringWidth(word, 0, i+1) < maxWidth) end = i+1;
                else break;
            }
            
            return end;
        }

    }
}
