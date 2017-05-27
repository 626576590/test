package com.cecsm.mpspcore.common.entity;

import java.util.Date;

public class patient {
    private Long patient_id;

    private Integer status;

    private String name;

    private String id_number;

    private Date birthday;

    private String gender;

    private Integer age;

    private Integer height;

    private Integer bmi_index;

    private String diabetes_type;

    private String diabetes_other;

    private Integer diabetes_age;

    private String syndrome;

    private String syndrome_check;

    private String medication;

    private String binding_wechat;

    private String address;

    private String province;

    private String city;

    private String area;

    private String town;

    private String telephone;

    private String person;

    private String person_relation;

    private String person_relation_other;

    private String person_telephone;

    private String glucometer_code;

    private String disease_history;

    private String disease_check;

    private String disease_check_other;

    private String family_history;

    private String family_history_check;

    private String allergy;

    private String allergy_name;

    private String history_cure;

    private String history_cure_type;

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

    private String remark;

    private Integer source;

    private Date diagnosis_date;

    private Long delete_user_id;

    private Date createtime;

    private String create_user_id;

    private Date updatetime;

    private String update_user_id;

    public Long getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(Long patient_id) {
        this.patient_id = patient_id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number == null ? null : id_number.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getBmi_index() {
        return bmi_index;
    }

    public void setBmi_index(Integer bmi_index) {
        this.bmi_index = bmi_index;
    }

    public String getDiabetes_type() {
        return diabetes_type;
    }

    public void setDiabetes_type(String diabetes_type) {
        this.diabetes_type = diabetes_type == null ? null : diabetes_type.trim();
    }

    public String getDiabetes_other() {
        return diabetes_other;
    }

    public void setDiabetes_other(String diabetes_other) {
        this.diabetes_other = diabetes_other == null ? null : diabetes_other.trim();
    }

    public Integer getDiabetes_age() {
        return diabetes_age;
    }

    public void setDiabetes_age(Integer diabetes_age) {
        this.diabetes_age = diabetes_age;
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

    public String getBinding_wechat() {
        return binding_wechat;
    }

    public void setBinding_wechat(String binding_wechat) {
        this.binding_wechat = binding_wechat == null ? null : binding_wechat.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town == null ? null : town.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person == null ? null : person.trim();
    }

    public String getPerson_relation() {
        return person_relation;
    }

    public void setPerson_relation(String person_relation) {
        this.person_relation = person_relation == null ? null : person_relation.trim();
    }

    public String getPerson_relation_other() {
        return person_relation_other;
    }

    public void setPerson_relation_other(String person_relation_other) {
        this.person_relation_other = person_relation_other == null ? null : person_relation_other.trim();
    }

    public String getPerson_telephone() {
        return person_telephone;
    }

    public void setPerson_telephone(String person_telephone) {
        this.person_telephone = person_telephone == null ? null : person_telephone.trim();
    }

    public String getGlucometer_code() {
        return glucometer_code;
    }

    public void setGlucometer_code(String glucometer_code) {
        this.glucometer_code = glucometer_code == null ? null : glucometer_code.trim();
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

    public String getFamily_history() {
        return family_history;
    }

    public void setFamily_history(String family_history) {
        this.family_history = family_history == null ? null : family_history.trim();
    }

    public String getFamily_history_check() {
        return family_history_check;
    }

    public void setFamily_history_check(String family_history_check) {
        this.family_history_check = family_history_check == null ? null : family_history_check.trim();
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

    public String getHistory_cure() {
        return history_cure;
    }

    public void setHistory_cure(String history_cure) {
        this.history_cure = history_cure == null ? null : history_cure.trim();
    }

    public String getHistory_cure_type() {
        return history_cure_type;
    }

    public void setHistory_cure_type(String history_cure_type) {
        this.history_cure_type = history_cure_type == null ? null : history_cure_type.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Date getDiagnosis_date() {
        return diagnosis_date;
    }

    public void setDiagnosis_date(Date diagnosis_date) {
        this.diagnosis_date = diagnosis_date;
    }

    public Long getDelete_user_id() {
        return delete_user_id;
    }

    public void setDelete_user_id(Long delete_user_id) {
        this.delete_user_id = delete_user_id;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreate_user_id() {
        return create_user_id;
    }

    public void setCreate_user_id(String create_user_id) {
        this.create_user_id = create_user_id == null ? null : create_user_id.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdate_user_id() {
        return update_user_id;
    }

    public void setUpdate_user_id(String update_user_id) {
        this.update_user_id = update_user_id == null ? null : update_user_id.trim();
    }
}