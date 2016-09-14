/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Abstract.*;

/**
 *
 * @author Radomir
 */
abstract class MitrosRadnik {
    Gitara g;
    Pojacalo p;
    Ponuda ponuda;
    
    abstract void kreirajGitaru();
    abstract void kreirajPojacalo();
    abstract void kreirajPonudu();

    abstract String testiraj(Ponuda ponuda);
}
