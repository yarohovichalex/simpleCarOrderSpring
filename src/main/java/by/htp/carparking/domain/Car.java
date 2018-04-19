package by.htp.carparking.domain;

public class Car extends Entity {

	private static final long serialVersionUID = 3834942036631822516L;
	
	private int id;
	private String status;
	private String model;
	private String brand;
	private String startDate;
	private String endDate;



	public Car() {
		super();
	}

	public Car(int id) {
		super(id);
	}

	public Car(int id, String model, String brand) {
		super(id);
		this.model = model;
		this.brand = brand;
	}
	
	
	public Car(int id, String model, String brand, String startDate, String endDate, String status) {
		super();
		this.id = id;
		this.model = model;
		this.brand = brand;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
	}
	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * getId();
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (getId() != other.getId()) {
			return false;
		} else if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", brand=" + brand + ", getId()=" + getId() + "]";
	}

}
