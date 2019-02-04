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
public class Proveedor {
    
    private int idProveedor;
    private String nomProveedor;
    private String dirProveedor;
    private String telProveedor;
    private String emailProveedor;
    private String contactoProveedor;

    public Proveedor(int idProveedor, String nomProveedor, String dirProveedor, 
            String telProveedor, String emailProveedor, String contactoProveedor) {
        this.idProveedor = idProveedor;
        this.nomProveedor = nomProveedor;
        this.dirProveedor = dirProveedor;
        this.telProveedor = telProveedor;
        this.emailProveedor = emailProveedor;
        this.contactoProveedor = contactoProveedor;
    }
    
    public Proveedor(){
        super();
    }

    public String getContactoProveedor() {
        return contactoProveedor;
    }

    public void setContactoProveedor(String contactoProveedor) {
        this.contactoProveedor = contactoProveedor;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNomProveedor() {
        return nomProveedor;
    }

    public void setNomProveedor(String nomProveedor) {
        this.nomProveedor = nomProveedor;
    }

    public String getDirProveedor() {
        return dirProveedor;
    }

    public void setDirProveedor(String dirProveedor) {
        this.dirProveedor = dirProveedor;
    }

    public String getTelProveedor() {
        return telProveedor;
    }

    public void setTelProveedor(String telProveedor) {
        this.telProveedor = telProveedor;
    }

    public String getEmailProveedor() {
        return emailProveedor;
    }

    public void setEmailProveedor(String emailProveedor) {
        this.emailProveedor = emailProveedor;
    }
    
    @Override
    public String toString(){
        return this.nomProveedor;
    }
    
    @Override
    public boolean equals(Object obj){
        Integer cod1 = this.getIdProveedor();
        Integer cod2 = ((Proveedor) obj).getIdProveedor();
        
        if (cod1.equals(cod2)){
            return true; // son iguales
        } else{
            return false; // son diferentes
        }
    }
    
}
