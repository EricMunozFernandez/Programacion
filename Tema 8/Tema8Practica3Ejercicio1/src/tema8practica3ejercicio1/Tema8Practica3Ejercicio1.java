/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8practica3ejercicio1;

import GUI.VentanaAlmacen;
import UML.*;
import java.util.ArrayList;

/**
 *
 * @author 1gdaw07
 */
public class Tema8Practica3Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static VentanaAlmacen v;
    private static ArrayList<Producto> listaProductos;
    private static Producto p;
    private static ArrayList<Proveedor> listaProveedores;
    private static Proveedor prov;
    public static void main(String[] args) {
        // TODO code application logic here
        crearProductos();
        crearProveedores();
        v=new VentanaAlmacen();
        v.setVisible(true);
        
    }
    public static void crearProductos()
    {
        listaProductos = new ArrayList<Producto>();
        p = new Producto ("Producto uno",500,2.5);
        listaProductos.add(p);
         p = new Producto ("Producto dos",24,6.4);
        listaProductos.add(p);
         p = new Producto ("Producto tres",700,5.5);
        listaProductos.add(p);
         p = new Producto ("Producto cuatro",40,6.5);
        listaProductos.add(p);
         p = new Producto ("Producto cinco",60,7);
        listaProductos.add(p);
         p = new Producto ("Producto seis",25,20);
        listaProductos.add(p);
    }
    public static void crearProveedores()
    {
        listaProveedores=new ArrayList<Proveedor>();
        prov=new Proveedor();
        prov.setNombre("Proveedor uno");
        ArrayList<Producto> listaProductosUno = new ArrayList<Producto>();
        listaProductos.get(0);
        listaProductos.get(2);
        listaProductos.get(3);
        prov.setProductos(listaProductosUno);
        listaProveedores.add(prov);
        prov=new Proveedor();
        prov.setNombre("Proveedor dos");
        ArrayList<Producto> listaProductosDos = new ArrayList<Producto>();
        listaProductos.get(1);
        listaProductos.get(4);
        listaProductos.get(3);
        prov.setProductos(listaProductosDos);
        listaProveedores.add(prov);
        prov=new Proveedor();
        prov.setNombre("Proveedor tres");
        ArrayList<Producto> listaProductosTres = new ArrayList<Producto>();
        listaProductos.get(5);
        listaProductos.get(4);
        listaProductos.get(2);
        prov.setProductos(listaProductosTres);
        listaProveedores.add(prov);
    }
    public static boolean validarProd(String nomProd)
    {
        int x;
        for(x=0; x < listaProductos.size() && listaProductos.get(x).getNombre().compareToIgnoreCase(nomProd)!= 0; x++){}
        if (x == listaProductos.size())
            return false;
        p = listaProductos.get(x);
        return true;
    }
    public static ArrayList validarProveedor()
    {
        int x;
        int y;
        ArrayList<Proveedor> comboboxProveedores = new ArrayList<Proveedor>();
        for(x=0;x<listaProveedores.size();x++)
        { 
            for(y=0;y<listaProveedores.get(x).getProductos().size();y++)
            {
                if(listaProveedores.get(x).getProductos().get(y).getNombre().compareToIgnoreCase(p.getNombre())==0)
                {
                    comboboxProveedores.add(listaProveedores.get(y));
                }                
            }
        }
        return comboboxProveedores;
    }
}
