/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsalibity;

/**
 *
 * @author Radomir
 */
abstract class Servis {
    Servis preduslov;
    Servis getPreduslov(){
        return preduslov;
    }
    abstract boolean uradiServis();
    Servis(Servis preduslov){this.preduslov=preduslov;}
    static void kreniUProceduru(Servis ss){
        if(ss==null) return;
        else {
            ss.kreniUProceduru(ss.getPreduslov());
            ss.uradiServis();
        }
    }  
}
