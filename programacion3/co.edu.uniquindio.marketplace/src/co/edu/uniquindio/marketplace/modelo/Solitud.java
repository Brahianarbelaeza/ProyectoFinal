package modelo;

public class Solitud {
    public class SolicitudAmistad {

        private Vendedor emisor;
        private Vendedor receptor;
        private EstadoSolicitud estado;

        public SolicitudAmistad(Vendedor emisor, Vendedor receptor) {
            this.emisor = emisor;
            this.receptor = receptor;
            this.estado = EstadoSolicitud.PENDIENTE;
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

        public void aceptar() {
            estado = EstadoSolicitud.ACEPTADA;
        }

        public void rechazar() {
            estado = EstadoSolicitud.RECHAZADA;
        }
    }

    public enum EstadoSolicitud {
        PENDIENTE,
        ACEPTADA,
        RECHAZADA
    }
}

