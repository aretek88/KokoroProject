package es.kokoro.dao;

import es.kokoro.model.*;

public class FactoryDao {
    public static DAO getFactoryDao(Class classInstance) throws Exception {
        if (classInstance.equals(Socio.class)) {
            return new SocioDAO();
        } else if (classInstance.equals(Contratado.class)) {
            return new ContratadoDAO();
        } else if (classInstance.equals(VoluntarioColaborador.class)) {
            return new VoluntarioColaboradorDAO();
        } else if (classInstance.equals(VoluntarioInternacional.class)) {
            return new VoluntarioInternacionalDAO();
        } else if (classInstance.equals(Sede.class)) {
            return new SedeDAO();
        } else if (classInstance.equals(Trabajador.class)) {
            return new TrabajadorDAO();
        } else if (classInstance.equals(Persona.class)) {
            return new PersonaDAO();
        } else if (classInstance.equals(Delegacion.class)) {
            return new DelegacionDAO();
        } else if (classInstance.equals(Empresa.class)) {
            return new EmpresaDAO();
        } else if (classInstance.equals(Particular.class)) {
            return new ParticularDAO();
        } else if (classInstance.equals(Herencia.class)) {
            return new HerenciaDAO();
        } else if (classInstance.equals(Sociedad.class)) {
            return new SociedadDAO();
        } else if (classInstance.equals(Institucion.class)) {
            return new InstitucionDAO();
        } else if (classInstance.equals(Extraordinario.class)) {
            return new ExtraordinarioDAO();
        } else if (classInstance.equals(Ong.class)) {
            return new OngDAO();
        } else if (classInstance.equals(SocioLocal.class)) {
            return new SocioLocalDAO();
        } else if (classInstance.equals(Financiador.class)) {
            return new FinanciadorDAO();
        } else if (classInstance.equals(Proyecto.class)) {
            return new ProyectoDAO();
        } else if (classInstance.equals(Ingreso.class)) {
            return new IngresoDAO();
        } else if (classInstance.equals(Estatal.class)) {
            return new EstatalDAO();
        } else if (classInstance.equals(Internacional.class)) {
            return new InternacionalDAO();
        } else if (classInstance.equals(EntePublico.class)) {
            return new EntePublicoDAO();
        } else if (classInstance.equals(Accion.class)) {
            return new AccionDAO();
        } else if (classInstance.equals(LineaAccion.class)) {
            return new LineaAccionDAO();
        } else if (classInstance.equals(SubLineaAccion.class)) {
            return new SubLineaAccionDAO();
        }
        throw new Exception("Clase desconocida");

    }
}


