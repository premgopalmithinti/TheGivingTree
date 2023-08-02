package com.jfsd.project.springboot.model;

import java.sql.Date;
import java.util.Base64;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name ="ActivityTGT")
public class Activity {
	
	@Id
	@GeneratedValue
	private int id;
	
	
	@Lob
	private byte[] image;
	@Column
	private String donarname;
	@Column
	private Date donationDate;
	@Column
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getDonarname() {
		return donarname;
	}
	public void setDonarname(String donarname) {
		this.donarname = donarname;
	}
	public Date getDonationDate() {
		return donationDate;
	}
	public void setDonationDate(Date donationDate) {
		this.donationDate = donationDate;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public static String convertBinImageToString(byte[] accPicture) {
        if(accPicture!=null && accPicture.length>0) {
            return Base64.getEncoder().encodeToString(accPicture);
        }
        else
            return "";
    }
	

}
