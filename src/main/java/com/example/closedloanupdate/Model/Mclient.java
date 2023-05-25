package com.example.closedloanupdate.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="m_loan")
public class Mclient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column(name="account_no")
    public String accountNo;
    @Column(name="external_id")
    public String externalId;
    @Column(name="status_enum")
    public  Integer statusEnum;
    @Column(name="sub_status")
    public Integer subStatus;
    @Column(name="activation_date")
    public Date activationDate;
    @Column(name="office_joining_date")
    public Date officeJoiningDate;
    @Column(name="office_id")
    public Integer officeId;
    @Column(name="transfer_to_office_id")
    public Integer transferToOfficeId;
    @Column(name="staff_id")
    public Integer staffId;
    @Column(name="firstname")
    public String firstName;
    @Column(name="moddlename")
    public String moddleName;
    @Column(name="lastname")
    public String lastName;
    @Column(name="fullname")
    public String fullName;
    @Column(name="display_name")
    public String displayName;
    @Column(name="mobile_no")
    public  String mobileNo;
    @Column(name="is_staff")
    public Boolean isStaff;
    @Column(name="gender_cv_id")
    public Integer genderCvId;
    @Column(name="date_of_birth")
    public Date dateOfBirth;
    @Column(name="image_id")
    public Integer imageId;
    @Column(name="closure_reason_cv_id")
    public Integer closurereasoncvid;
    @Column(name="closedon_date")
    public Date closedOnDate;
    @Column(name="updated_by")
    public Integer updatedBy;
    @Column(name="updated_on")
    public Date updatedOn;
    @Column(name="submittedon_date")
    public Date submittedonDate;
    @Column(name="activatedon_userid")
    public  Integer activatedonUserid;
    @Column(name="closedon_userid")
    public Integer closedonUserid;
    @Column(name="default_savings_product")
    public Integer defaultSavingsProduct;
    @Column(name="default_savings_account")
    public Integer defaultSavingsAccount;
    @Column(name="client_type_cv_id")
    public Integer clientTypeCvId;
    @Column(name="client_classification_cv_id")
    public Integer clientClassificationCvId;
    @Column(name="reject_reason_cv_id")
    public Integer rejectReasonCvId;
    @Column(name="rejectedon_date")
    public Date rejectedOnDate;
    @Column(name="rejectedon_userid")
    public Integer rejectedOnUserid;
    @Column(name="withdraw_reason_cv_id")
    public Integer withdrawReasonCvId;
    @Column(name="withdrawn_on_date")
    public Date withdrawnOnDate;
    @Column(name="withdrawnon_userid")
    public Integer withdrawOnUserid;
    @Column(name="reactivated_on_date")
    public Date reactivatedOnDate;
    @Column(name="reactivated_on_userid")
    public Integer reactivatedOnUserid;
    @Column(name="legal_form_enum")
    public Integer legalFormEnum;
    @Column(name="reopened_on_date")
    public Date reopenedOnDate;
    @Column(name="reopened_by_userid")
    public Integer reopenedByUserid;
    @Column(name="email_address")
    public String emailAddress;
    @Column(name="proposed_transfer_date")
    public Date proposedTransferDate;
    @Column(name="created_on_utc")
    public OffsetDateTime createdoOnUtc;
    @Column(name="created_by")
    public Integer createdBy;
    @Column(name="last_modified_by")
    public Integer lastModifiedBy;
    @Column(name="last_modified_on_utc")
    public LocalDateTime lastModifiedOnUtc;

}
