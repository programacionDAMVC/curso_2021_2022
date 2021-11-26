/*
 * Circulo.java
 * 
 */


public class Circulo {
		
		//final float PI = 3.14f;
	
		//atributo
		private float radio = 5.5f;
		
		//getter
		public float getRadio() {
			return radio;
		}
		
		//setter
		public void setRadio(float radio){
			this.radio = radio;
		}
		
		//resto de métodos
		public float getArea() {
			
			/*float area = PI * radio * radio;
			return area;*/
			
			return  (float) (Math.PI * radio * radio);
		}
		
		public float getLongitud() {
			
			return (float) (2.0 * Math.PI * radio);
		}
		
	
}

