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
class Radnik2 implements MitrosRadnik{

    @Override
    public Gitara kreirajGitaru() {
        return new Fender();
    }

    @Override
    public Pojacalo kreirajPojacalo() {
        return new Orange();
    }
}
