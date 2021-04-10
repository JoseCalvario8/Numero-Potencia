/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose
 */
public class TDA_Potencia {
    int n1=1,n2=1,jose=1,calvario=n1*n2,resul;
    public int Potencia (int n1, int n2){
        if (jose<=n2){
            calvario=calvario*n1;
        }
        else{
            return resul;
        }
        resul=calvario;
        jose++;
        return Potencia(n1, n2);

    }
}
    
