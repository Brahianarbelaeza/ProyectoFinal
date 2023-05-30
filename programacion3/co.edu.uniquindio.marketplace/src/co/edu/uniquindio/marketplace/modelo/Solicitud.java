package modelo;

public class Solicitud extends Persona{


        private Vendedor emisor;
        private Vendedor receptor;
        private String nombre;
        private String apellido;
        private EstadoSolicitud estado=EstadoSolicitud.ENVIADA;

        /*public SolicitudAmistad(Vendedor emisor, Vendedor receptor) {
            this.emisor = emisor;
            this.receptor = receptor;
            this.estado = EstadoSolicitud.PENDIENTE;
        }*/
        public Solicitud(String nombre, String apellido, String cedula, Cuenta cuenta, Vendedor emisor, Vendedor receptor, EstadoSolicitud estado) {
            super(nombre, apellido, cedula, cuenta);
            this.emisor = emisor;
            this.receptor = receptor;
            this.estado = estado;
        }

        public Solicitud(){
            super();
        }

    public Solicitud(Vendedor emisor, Vendedor receptor, EstadoSolicitud estado) {
            this.emisor = emisor;
            this.receptor = receptor;
            this.estado = estado;
    }




    public Vendedor getEmisor() {
            return emisor;
        }

        public Vendedor getReceptor() {
            return receptor;
        }

        public EstadoSolicitud getEstado() {
            return estado;
        }

        public void setEmisor(Vendedor emisor) {
            this.emisor = emisor;
        }

        public void setReceptor(Vendedor receptor) {
            this.receptor = receptor;
        }

        public void setEstado(EstadoSolicitud estado) {
            this.estado = estado;
        }

        @Override
        public String getNombre() {
            return nombre;
        }

        @Override
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public String getApellido() {
            return apellido;
        }

        @Override
        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public void aceptar() {
            estado = EstadoSolicitud.ACEPTADA;
        }

        public void rechazar() {
            estado = EstadoSolicitud.RECHAZADA;
        }



    public enum EstadoSolicitud {

        ENVIADA,
        RECIBIDA,
        PENDIENTE,
        ACEPTADA,
        RECHAZADA
    }

    public EstadoSolicitud getEstadoSolicitud(){
            return estado;
    }

    public void setEstadoSolicitud(EstadoSolicitud estado){
            this.estado = estado;
    }

}

