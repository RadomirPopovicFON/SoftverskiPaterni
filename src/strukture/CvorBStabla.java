/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukture;

/**
 *
 * @author Radomir
 */
public class CvorBStabla {
        
        int pod;
        CvorBStabla levoDete;
        CvorBStabla desnoDete;

        public CvorBStabla(int pod, CvorBStabla levoDete, CvorBStabla desnoDete) {
            this.pod = pod;
            this.levoDete = levoDete;
            this.desnoDete = desnoDete;
        }
}
