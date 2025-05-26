public class Country {
    private String countryname;

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }
}
public class State extends Country {
    private String statename;
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	} 
}
public class City extends State {
    private String cityname;

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

}
public class MultilevelInheritance {
        public static void main(String[] args) {
            City ob = new City();
            ob.setCountryname("India");
            ob.setStatename("Maharastra");
            ob.setCityname("pune");

            System.out.println(ob.getCountryname());
            System.out.println(ob.getStatename());
            System.out.println(ob.getCityname());

        }

    }

