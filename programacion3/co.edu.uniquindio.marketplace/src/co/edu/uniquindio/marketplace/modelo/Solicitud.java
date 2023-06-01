package modelo;

import java.io.Serializable;

public class Solicitud implements Serializable {

        private static final long serialVersionUID = 1L;
        private Vendedor emisor;
        private Vendedor receptor;
        private EstadoSolicitud estado;

    public Solicitud() {

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

}

