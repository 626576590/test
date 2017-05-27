package com.cecsm.core.entity;

import com.cecsm.common.bean.Base;
import java.util.Date;

public class Patient extends Base {
    private Long patient_id;

    private String name;

    private String gender;

    private Integer age;

    private Date birth_date;

    private String id_number;

    private String telephone;

    private Float height;

    private Float weight;

    private Float BMI;

    private String diabetes_type;

    private Integer duration;

    private String remark;

    private String address;

    private String emergencycontact;

    private String emergency;

    private String emergencycontact_other;

    private String contact_telephone;

    private String imei;

    private String disease_history;

    private String disease_check;

    private String disease_check_other;

    private String family_pathography;

    private String family_pathography_check;

    private String allergy;

    private String allergy_name;

    private String therapy;

    private String syndrome;

    private String syndrome_check;

    private String medication;

    private String therapy_type;

    private String oral_name;

    private Integer oral_number;

    private String oral_year;

    private String sport;

    private String smoke;

    private Integer smoke_number;

    private String drink;

    private String drink_name;

    private Integer drink_number;

    private String sport_habit;

    private Integer sport_number;

    private String sport_memo;

    private Long create_user_id;

    private Long update_user_id;

    private Date diagnosis_date;

    private String pharmacy;

    public Long getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(Long patient_id) {
        this.patient_id = patient_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number == null ? null : id_number.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getBMI() {
        return BMI;
    }

    public void setBMI(Float BMI) {
        this.BMI = BMI;
    }

    public String getDiabetes_type() {
        return diabetes_type;
    }

    public void setDiabetes_type(String diabetes_type) {
        this.diabetes_type = diabetes_type == null ? null : diabetes_type.trim();
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEmergencycontact() {
        return emergencycontact;
    }

    public void setEmergencycontact(String emergencycontact) {
        this.emergencycontact = emergencycontact == null ? null : emergencycontact.trim();
    }

    public String getEmergency() {
        return emergency;
    }

    public void setEmergency(String emergency) {
        this.emergency = emergency == null ? null : emergency.trim();
    }

    public String getEmergencycontact_other() {
        return emergencycontact_other;
    }

    public void setEmergencycontact_other(String emergencycontact_other) {
        this.emergencycontact_other = emergencycontact_other == null ? null : emergencycontact_other.trim();
    }

    public String getContact_telephone() {
        return contact_telephone;
    }

    public void setContact_telephone(String contact_telephone) {
        this.contact_telephone = contact_telephone == null ? null : contact_telephone.trim();
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public String getDisease_history() {
        return disease_history;
    }

    public void setDisease_history(String disease_history) {
        this.disease_history = disease_history == null ? null : disease_history.trim();
    }

    public String getDisease_check() {
        return disease_check;
    }

    public void setDisease_check(String disease_check) {
        this.disease_check = disease_check == null ? null : disease_check.trim();
    }

    public String getDisease_check_other() {
        return disease_check_other;
    }

    public void setDisease_check_other(String disease_check_other) {
        this.disease_check_other = disease_check_other == null ? null : disease_check_other.trim();
    }

    public String getFamily_pathography() {
        return family_pathography;
    }

    public void setFamily_pathography(String family_pathography) {
        this.family_pathography = family_pathography == null ? null : family_pathography.trim();
    }

    public String getFamily_pathography_check() {
        return family_pathography_check;
    }

    public void setFamily_pathography_check(String family_pathography_check) {
        this.family_pathography_check = family_pathography_check == null ? null : family_pathography_check.trim();
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy == null ? null : allergy.trim();
    }

    public String getAllergy_name() {
        return allergy_name;
    }

    public void setAllergy_name(String allergy_name) {
        this.allergy_name = allergy_name == null ? null : allergy_name.trim();
    }

    public String getTherapy() {
        return therapy;
    }

    public void setTherapy(String therapy) {
        this.therapy = therapy == null ? null : therapy.trim();
    }

    public String getSyndrome() {
        return syndrome;
    }

    public void setSyndrome(String syndrome) {
        this.syndrome = syndrome == null ? null : syndrome.trim();
    }

    public String getSyndrome_check() {
        return syndrome_check;
    }

    public void setSyndrome_check(String syndrome_check) {
        this.syndrome_check = syndrome_check == null ? null : syndrome_check.trim();
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication == null ? null : medication.trim();
    }

    public String getTherapy_type() {
        return therapy_type;
    }

    public void setTherapy_type(String therapy_type) {
        this.therapy_type = therapy_type == null ? null : therapy_type.trim();
    }

    public String getOral_name() {
        return oral_name;
    }

    public void setOral_name(String oral_name) {
        this.oral_name = oral_name == null ? null : oral_name.trim();
    }

    public Integer getOral_number() {
        return oral_number;
    }

    public void setOral_number(Integer oral_number) {
        this.oral_number = oral_number;
    }

    public String getOral_year() {
        return oral_year;
    }

    public void setOral_year(String oral_year) {
        this.oral_year = oral_year == null ? null : oral_year.trim();
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport == null ? null : sport.trim();
    }

    public String getSmoke() {
        return smoke;
    }

    public void setSmoke(String smoke) {
        this.smoke = smoke == null ? null : smoke.trim();
    }

    public Integer getSmoke_number() {
        return smoke_number;
    }

    public void setSmoke_number(Integer smoke_number) {
        this.smoke_number = smoke_number;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink == null ? null : drink.trim();
    }

    public String getDrink_name() {
        return drink_name;
    }

    public void setDrink_name(String drink_name) {
        this.drink_name = drink_name == null ? null : drink_name.trim();
    }

    public Integer getDrink_number() {
        return drink_number;
    }

    public void setDrink_number(Integer drink_number) {
        this.drink_number = drink_number;
    }

    public String getSport_habit() {
        return sport_habit;
    }

    public void setSport_habit(String sport_habit) {
        this.sport_habit = sport_habit == null ? null : sport_habit.trim();
    }

    public Integer getSport_number() {
        return sport_number;
    }

    public void setSport_number(Integer sport_number) {
        this.sport_number = sport_number;
    }

    public String getSport_memo() {
        return sport_memo;
    }

    public void setSport_memo(String sport_memo) {
        this.sport_memo = sport_memo == null ? null : sport_memo.trim();
    }

    public Long getCreate_user_id() {
        return create_user_id;
    }

    public void setCreate_user_id(Long create_user_id) {
        this.create_user_id = create_user_id;
    }

    public Long getUpdate_user_id() {
        return update_user_id;
    }

    public void setUpdate_user_id(Long update_user_id) {
        this.update_user_id = update_user_id;
    }

    public Date getDiagnosis_date() {
        return diagnosis_date;
    }

    public void setDiagnosis_date(Date diagnosis_date) {
        this.diagnosis_date = diagnosis_date;
    }

    public String getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(String pharmacy) {
        this.pharmacy = pharmacy == null ? null : pharmacy.trim();
    }
}