package ReferenceProject.backend.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Location implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@NotNull
	@Column(name="INTERNAL_ID__")
	@XmlElement
	protected int __internalId;
	
	@NotNull
	@XmlElement(nillable=true)
	protected String myStreet;
	
	@NotNull
	@XmlElement(nillable=true)
	protected String myStreetNo;
	
	@NotNull
	@XmlElement(nillable=true)
	protected int myPostalCode;
	
	@NotNull
	@XmlElement(nillable=true)
	protected String myCity;
	
	@NotNull
	@XmlElement(nillable=true)
	protected String myCountry;
	
	@NotNull
	@XmlElement(nillable=true)
	protected double myLatitude;
	
	@NotNull
	@XmlElement(nillable=true)
	protected double myLongitude;
	
	
	///////////////////////////////////////
	/// Getters and setters
	///////////////////////////////////////
	
	public int getInternal__id() {
		return __internalId;
	}
	
	public String getMyStreet() {
		return myStreet;
	}
	
	public void setMyStreet(String myStreet) {
		this.myStreet = myStreet;
	}
	
	public String getMyStreetNo() {
		return myStreetNo;
	}
	
	public void setMyStreetNo(String myStreetNo) {
		this.myStreetNo = myStreetNo;
	}
	
	public int getMyPostalCode() {
		return myPostalCode;
	}
	
	public void setMyPostalCode(int myPostalCode) {
		this.myPostalCode = myPostalCode;
	}
	
	public String getMyCity() {
		return myCity;
	}
	
	public void setMyCity(String myCity) {
		this.myCity = myCity;
	}
	
	public String getMyCountry() {
		return myCountry;
	}
	
	public void setMyCountry(String myCountry) {
		this.myCountry = myCountry;
	}
	
	public double getMyLatitude() {
		return myLatitude;
	}
	
	public void setMyLatitude(double myLatitude) {
		this.myLatitude = myLatitude;
	}
	
	public double getMyLongitude() {
		return myLongitude;
	}
	
	public void setMyLongitude(double myLongitude) {
		this.myLongitude = myLongitude;
	}
	
}
