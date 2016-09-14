/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author Radomir
 */
class Radnik1 implements MitrosRadnik{
    @Override
    public Gitara kreirajGitaru() {
        return new Gibson();
    }
    @Override
    public Pojacalo kreirajPojacalo() {
        return new Marshall();
    }  
}
