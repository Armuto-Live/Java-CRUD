package org.example;

import com.armutolive.models.Autor;
import com.armutolive.models.Estudiante;
import com.armutolive.models.Libro;
import  com.armutolive.utils.HibernateUtil;
import org.hibernate.Session;
import com.armutolive.models.Departamento;
public class App 
{
    public static void main( String[] args )
    {
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

//        Autor autor=new Autor();
//        autor.setCelular("97456321");
//        autor.setNombre("QUISPE");

//        Libro libro=new Libro();
////        libro.setAnio("221");
////        libro.setPaginas(225);
////        libro.setTitulo("EL quispe");

        Autor autor=session.get(Autor.class,1l);
        Libro libro=session.get(Libro.class,1l);
        libro.getAutors().add(autor);

        session.update(libro);

        session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdown();
//        Departamento depa=session.get(Departamento.class,1);
//        Estudiante estu=new Estudiante();
//        estu.setDepartamento(depa);
//
//        System.out.println(depa.getEstudianteList().size());
//        depa.getEstudianteList().add(estu);

//        depa.setPiso(1);
//        depa.setNombre("unpiso");
//        depa.setNumero(1);

//        session.save(estu);
//        session.getTransaction().commit();
//        session.close();
//        HibernateUtil.shutdown();


//        Departamento depa=new Departamento();
//        depa.setNombre("Matacraken");
//        depa.setNumero(4);
//        depa.setPiso(2);
//
//        session.save(depa);
//
//
//        Estudiante estu=new Estudiante();
//        estu.setNombre("Luis");
//        estu.setApellidos("Armuto");
//        estu.setDepartamento(depa);
//        session.save(estu);
//
//        session.getTransaction().commit();
//        session.close();
//        HibernateUtil.shutdown();

        //Cambio
//        Departamento depa=session.get(Departamento.class,1);
//
//        Estudiante estu=new Estudiante();
//
//        estu.setNombre("Angel");
//        estu.setApellidos("Armuto aAbarca");
//        estu.setDepartamento(depa);
//        session.save(estu);
//
//        session.getTransaction().commit();
//        session.close();
//        HibernateUtil.shutdown();

//        //Estudiante obj=new Estudiante();
//        //obj.setNombre("Luis");
//        //obj.setApellidos("Armuto");
//        //System.out.println(obj);
//        session.beginTransaction();
//
//        Estudiante estudiante=session.get(Estudiante.class,1);
//        //estudiante.setApellidos("Que dices");
//        session.delete(estudiante);
//
//        //session.save(obj);
//        session.getTransaction().commit();
//        session.close();
//        HibernateUtil.shutdown();
//        System.out.println(estudiante);

        //Crear departamento
    }
}
