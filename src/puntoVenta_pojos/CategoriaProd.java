/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoVenta_pojos;

/**
 *
 * @author Zenon
 */
public class CategoriaProd {
    
    private int idCategoriaProd;
    private String nomCategoriaProd;
    private String descCategoriaProd;

    public CategoriaProd(int idCategoriaProd, String nomCategoriaProd, String descCategoriaProd) {
        this.idCategoriaProd = idCategoriaProd;
        this.nomCategoriaProd = nomCategoriaProd;
        this.descCategoriaProd = descCategoriaProd;
    }

    public String getDescCategoriaProd() {
        return descCategoriaProd;
    }

    public void setDescCategoriaProd(String descCategoriaProd) {
        this.descCategoriaProd = descCategoriaProd;
    }

    public int getIdCategoriaProd() {
        return idCategoriaProd;
    }

    public void setIdCategoriaProd(int idCategoriaProd) {
        this.idCategoriaProd = idCategoriaProd;
    }

    public String getNomCategoriaProd() {
        return nomCategoriaProd;
    }

    public void setNomCategoriaProd(String nomCategoriaProd) {
        this.nomCategoriaProd = nomCategoriaProd;
    }
    
    @Override
    public String toString(){
        return this.nomCategoriaProd;
    }
}
