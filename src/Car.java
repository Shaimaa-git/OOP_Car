public class Car {
        // Attributes
        private String make;
        private String model;
        private Integer year;

        // Constructor
        public Car(String make, String model, Integer year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        // Getters and Setters
        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public Integer getYear() {
            return year;
        }

        public void setYear(Integer year) {
            this.year = year;
        }
    }


