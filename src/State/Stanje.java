/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author Radomir
 */
abstract class Stanje {
    abstract String vratiStanje();
    abstract String promeniStanje(Stanje s);
}