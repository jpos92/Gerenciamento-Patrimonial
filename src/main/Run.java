package main;

import java.awt.Font;
import java.io.IOException;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import view.LoginView;

public class Run{ 
    public static void main(String args[]) throws IOException {
        
        try {
            for ( LookAndFeelInfo info : UIManager.getInstalledLookAndFeels() ) {
                if ( "Windows".equals( info.getName() ) ) {
                    UIManager.setLookAndFeel( info.getClassName() );
                    break;
                }
            }
            } catch ( UnsupportedLookAndFeelException exc ) {
            exc.printStackTrace();
            } catch ( ClassNotFoundException exc ) {
            exc.printStackTrace();
            } catch ( InstantiationException exc ) {
            exc.printStackTrace();
            } catch ( IllegalAccessException exc ) {
            exc.printStackTrace();
}
        FontManager fontManager = new FontManager();
        Font roboto = fontManager.carregarFonte("/fonte/Roboto-Regular.ttf", Font.PLAIN, 13);
        UIManager.put("Button.font", roboto);
        UIManager.put("ToggleButton.font", roboto);
        UIManager.put("RadioButton.font", roboto);
        UIManager.put("CheckBox.font", roboto);
        UIManager.put("ColorChooser.font", roboto);
        UIManager.put("ComboBox.font", roboto);
        UIManager.put("Label.font", roboto);
        UIManager.put("List.font", roboto);
        UIManager.put("MenuBar.font", roboto);
        UIManager.put("MenuItem.font", roboto);
        UIManager.put("RadioButtonMenuItem.font", roboto);
        UIManager.put("CheckBoxMenuItem.font", roboto);
        UIManager.put("Menu.font", roboto);
        UIManager.put("PopupMenu.font", roboto);
        UIManager.put("OptionPane.font", roboto);
        UIManager.put("Panel.font", roboto);
        UIManager.put("ProgressBar.font", roboto);
        UIManager.put("ScrollPane.font", roboto);
        UIManager.put("Viewport.font", roboto);
        UIManager.put("TabbedPane.font", roboto);
        UIManager.put("Table.font", roboto);
        UIManager.put("TableHeader.font", roboto);
        UIManager.put("TextField.font", roboto);
        UIManager.put("PasswordField.font", roboto);
        UIManager.put("TextArea.font", roboto);
        UIManager.put("TextPane.font", roboto);
        UIManager.put("EditorPane.font", roboto);
        UIManager.put("TitledBorder.font", roboto);
        UIManager.put("ToolBar.font", roboto);
        UIManager.put("ToolTip.font", roboto);
        UIManager.put("Tree.font", roboto);
        
        new LoginView().setVisible(true);
    }
}
