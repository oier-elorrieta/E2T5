package Pojoak;


	 public class Bidaia {
	        
	        private String helmuga;
	        private String data;

	        
	        public Bidaia(String helmuga, String data) {
	            this.helmuga = helmuga;
	            this.data = data;
	        }

	        
	        public String getHelmuga() {
	            return helmuga;
	        }

	        public void setHelmuga(String helmuga) {
	            this.helmuga = helmuga;
	        }

	        public String getData() {
	            return data;
	        }

	        public void setData(String data) {
	            this.data = data;
	        }


			@Override
			public String toString() {
				return "Bidaia [helmuga=" + helmuga + ", data=" + data + "]";
			}
	        
	    

}
