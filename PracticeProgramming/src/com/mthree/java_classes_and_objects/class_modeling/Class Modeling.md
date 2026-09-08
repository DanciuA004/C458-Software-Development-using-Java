## Consider the important properties and methods needed for each scenario and each model and then create a Java class for each of the following:

### House

#### Model a house as if the class were to be part of a GPS mapping system.

        public abstract class HouseGPS {
        private int houseNumber;
        private String streetName;
        private String city;
        private String postcode;
        private String country;
        private double latitude;
        private double longitude;

        public HouseGPS(int houseNumber, String streetName,
                        String city, String postcode, String country,
                        double latitude, double longitude) {
            this.houseNumber = houseNumber;
            this.streetName = streetName;
            this.city = city;
            this.postcode = postcode;
            this.country = country;
            this.latitude = latitude;
            this.longitude = longitude;
        }
    
        public int getHouseNumber() { return houseNumber; }
        public void setHouseNumber(int houseNumber) { this.houseNumber = houseNumber; }
    
        public String getStreetName() { return streetName; }
        public void setStreetName(String streetName) { this.streetName = streetName; }
    
        public String getCity() { return city; }
        public void setCity(String city) { this.city = city; }
    
        public String getPostcode() { return postcode; }
        public void setPostcode(String postcode) { this.postcode = postcode; }
    
        public String getCountry() { return country; }
        public void setCountry(String country) { this.country = country; }
    
        public double getLatitude() { return latitude; }
        public void setLatitude(double latitude) { this.latitude = latitude; }
    
        public double getLongitude() { return longitude; }
        public void setLongitude(double longitude) { this.longitude = longitude;}
        }

#### Model a house as if the class were to be part of a 3-D design system.



### Airplane

        Model an airplane as if the class were to be part of an air traffic control system.
        Model an airplane as if the class were to be part of a flight simulator.

### Car

        Model a car as if the class were to be part of an inventory system for a car dealership.
        Model a car as if the class were to be part of a video game.

### Ice cream

        Model ice cream as if the class were to be part of the control system at the dairy that makes the ice cream.
        Model ice cream as if the class were to be part of the stocking system at a grocery store.

### Book

        Model a book as if the class were to be part of a publishing system that the author uses to write the book.
        Model a book as if the class were to be part of a library cataloging system.

Do the following for each class:

- Define properties; determine which will be read/write and which will be read-only. 
- Implement setters and getters (as appropriate) for each property. 
- Implement a constructor to initialize some or all of the property values. 
- Determine what behaviors the class should have and then define (do not implement) the methods associated with each behavior. 
- Be prepared to explain the reasons behind all of your design decisions.
