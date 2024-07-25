package medicamentos;

import java.util.ArrayList;

public class Medicamento {

	private String nombre;
	private String via;
	
	public Medicamento() {
		this.nombre = "";
		this.via = "";
	}
	public Medicamento(String nombre, String via) {
		this.nombre = nombre;
		this.via = via;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}

	
	@Override
	public String toString() {
		return "Medicamento [nombre=" + nombre + ", via=" + via + "]";
	}


	class PosologiaMedicamento {
		private String usuariosMedicamento;
		private int dosis;
		private String intervaloDosis;
		private ArrayList<String> recomendaciones;
		
		public PosologiaMedicamento() {
		}
		public PosologiaMedicamento(String usuariosMedicamento,int dosis, String intervaloDosis, ArrayList<String>  recomendaciones) {
			this.usuariosMedicamento = usuariosMedicamento;
			this.dosis = dosis;
			this.intervaloDosis = intervaloDosis;
			this.recomendaciones = recomendaciones;
		}
		public String getUsuariosMedicamento() {
			return usuariosMedicamento;
		}
		public void setUsuariosMedicamento(String usuariosMedicamento) {
			this.usuariosMedicamento = usuariosMedicamento;
		}
		public int getDosis() {
			return dosis;
		}
		public void setDosis(int dosis) {
			this.dosis = dosis;
		}
		public String getIntervaloDosis() {
			return intervaloDosis;
		}
		public void setIntervaloDosis(String intervaloDosis) {
			this.intervaloDosis = intervaloDosis;
		}
		public ArrayList<String> getRecomendaciones() {
			return recomendaciones;
		}
		public void setRecomendaciones(ArrayList<String> recomendaciones) {
			this.recomendaciones = recomendaciones;
		}
		private String mostrarRecomendaciones() {
			
			String cadena = "";
			for (String s:this.recomendaciones) {
				cadena += "\n" + s;
			}
			return cadena;
		}
		@Override
		public String toString() {
			return nombre + " [usuariosMedicamento=" + usuariosMedicamento + ", dosis=" + dosis
					+ ", intervaloDosis=" + intervaloDosis + ", recomendaciones=" + mostrarRecomendaciones() + "]";
		}
		
		
	}
}
