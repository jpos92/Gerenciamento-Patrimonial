/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

/**
 *
 * @author TI
 */
public class FontManager {
    
    public Font carregarFonte(String caminhoFonte, int tipoFonte, int tamanhoFonte) {
        
        Font minhaFonte = null;
        
        try{
            minhaFonte = Font.createFont(
                    Font.TRUETYPE_FONT, 
                    getClass().getResourceAsStream(caminhoFonte)
            ).deriveFont(tipoFonte, tamanhoFonte);
        }catch(IOException ex){
            ex.printStackTrace();
        }catch (FontFormatException ex){
            ex.printStackTrace();
        }
        
        return minhaFonte;
        
        
    }
    
}
