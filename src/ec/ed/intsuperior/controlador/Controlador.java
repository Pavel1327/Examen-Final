/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ed.intsuperior.controlador;

import ec.ed.intsuperior.vista.*;

/**
 *
 * @author ASUS
 */
public class Controlador {
  Login login = new Login(this); 
  Estudiante estudiante = new Estudiante(this);
  Administrador administrador = new Administrador(this);
  IngresarCurso ingresarCurso = new IngresarCurso(this);
  Docente docente = new Docente (this);
  IngresarMateria materia = new IngresarMateria(this);
  IngresarDocente docente1 = new IngresarDocente(this);
  IngresarEstudiante estudiante1 = new IngresarEstudiante(this);
  EditarMateria materia1 = new EditarMateria (this);
  Inicio_INT iNT = new Inicio_INT (this);
  
  

public void showLoggin(){
    login.setVisible(true);
    }
public void showEstudiante(){
    estudiante.setVisible(true);
    login.setVisible(false);
    }
    public void showDocente (){
    docente.setVisible(true);
    login.setVisible(false);
    }
 public void showMateria(){
    materia.setSize(800, 800);
    administrador.Escritorio.removeAll();
    administrador.Escritorio.add(materia);
    materia.setVisible(true);
    administrador.Escritorio.revalidate();
    materia.repaint();
    }
public void showAdministrador(){
    administrador.setVisible(true);
    }    
    public void showIngresarCurso(){   
    ingresarCurso.setSize(800, 800);
    administrador.Escritorio.removeAll();
    administrador.Escritorio.add(ingresarCurso);
    ingresarCurso.setVisible(true);
    administrador.Escritorio.revalidate();
    ingresarCurso.repaint();
   } 
public void showIngresarDocente(){   
    docente1.setSize(800, 800);
    administrador.Escritorio.removeAll();
    administrador.Escritorio.add(docente1);
    docente1.setVisible(true);
    administrador.Escritorio.revalidate();
    docente1.repaint();
   }
public void showIngresarEstudiante(){   
    estudiante1.setSize(800, 800);
    administrador.Escritorio.removeAll();
    administrador.Escritorio.add(estudiante1);
    estudiante1.setVisible(true);
    administrador.Escritorio.revalidate();
    estudiante1.repaint();
   } 
public void showEditarMateria(){   
    materia1.setSize(800, 800);
    administrador.Escritorio.removeAll();
    administrador.Escritorio.add(materia1);
    materia1.setVisible(true);
    administrador.Escritorio.revalidate();
    materia1.repaint();
   }
public void showInicio_INT(){   
    iNT.setSize(800, 800);
    administrador.Escritorio.removeAll();
    administrador.Escritorio.add(iNT);
    iNT.setVisible(true);
    administrador.Escritorio.revalidate();
    iNT.repaint();
   }

   
}
