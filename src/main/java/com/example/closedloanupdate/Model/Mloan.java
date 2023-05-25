package com.example.closedloanupdate.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="m_loan")
public class Mloan {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int id;
  @Column(name="account_no")
  public String accountNo;
  @Column(name="external_id")
  public String externalId;
  @Column(name="client_id")
  public Long clientId;
  @Column(name="group_id")
  public Long groupId;
  @Column(name="glim_id")
  public Long glimId;
  @Column(name="product_id")
  public Long productId;
  @Column(name="fund_id")
  public Long fundId;
  @Column(name="loan_officer_id")
  public Long loanOfficerId;
  @Column(name="loanpurpose_cv_id")
  public Integer loanPurposeCvId;
  @Column(name="loan_status_id")
  public Integer loanStatusId;
  @Column(name="loan_type_enum")
  public Short loanTypeEnum;
  @Column(name="currency_code")
  public String currencyCode;
  @Column(name="currency_digits")
  public Short currencyDigits;
  @Column(name="currency_multiplesof")
  public Short currencyMultiplesOf;
  @Column(name="principal_amount_proposed")
  public BigDecimal principalAmountProposed;
  @Column(name="principal_amount")
  public BigDecimal principalAmount;
  @Column(name="approved_principal")
  public BigDecimal approvedPrincipal;
  @Column(name="net_disbursal_amount")
  public BigDecimal netDisburalAmount;
  @Column(name="arrearstolerance_amount")
  public BigDecimal arrearstoleranceAmount;
  @Column(name="is_floating_interest_rate")
  public Boolean isFloatingInterestrate;
  @Column(name="interest_rate_differential")
  public BigDecimal interestrateDifferential;
  @Column(name="nominal_interest_rate_per_period")
  public BigDecimal nominalInterestRatePerPeriod;
  @Column(name="interest_period_frequency_enum")
  public Short interestPeriodFrequencyEnum;
  @Column(name="annual_nominal_interest_rate")
  public BigDecimal annualNominalInterestRate;
  @Column(name="interest_method_enum")
  public Short interestMethodEnum;
  @Column(name="interest_calculated_in_period_enum")
  public Short interestCalculatedInPeriodEnum;
  @Column(name="allow_partial_period_interest_calcualtion")
  public Boolean allowPartialPeriodInterestCalcualtion;
  @Column(name="term_frequency")
  public Short termFrequency;
  @Column(name="term_period_frequency_enum")
  public Short termPeriodFrequencyEnum;
  @Column(name="repay_every")
  public Short repayEvery;
  @Column(name="repayment_period_frequency_enum")
  public Short repaymentPeriodFrequencyEnum;
  @Column(name="number_of_repayments")
  public Short numberOfRepayments;
  @Column(name="grace_on_principal_periods")
  public Short graceOnPrincipalPeriods;
  @Column(name="recurring_moratorium_principal_periods")
  public Short recurringMoratoriumPrincipalPeriods;
  @Column(name="grace_on_interest_periods")
  public Short graceOnInterestPeriods;
  @Column(name="grace_interest_free_periods")
  public Short graceInterestFreePeriods;
  @Column(name="amortization_method_enum")
  public Short amortizationMethodEnum;
  @Column(name="submittedon_date")
  public Date submittedOnDate;
  @Column(name="approvedon_date")
  public Date approvedOnDate;
  @Column(name="approvedon_userid")
  public Long approvedonUserId;
  @Column(name="expected_disbursedon_date")
  public Date expectedDisbursedonDate;
  @Column(name="expected_firstrepaymenton_date")
  public Date expectedFirstrepaymentonDate;
  @Column(name="interest_calculated_from_date")
  public Date interestCalculatedFromDate;
  @Column(name="disbursedon_date")
  public Date disbursedOnDate;
  @Column(name="disbursedon_userid")
  public Long disbursedOnUserId;
  @Column(name="expected_maturedon_date")
  public Date expectedMaturedonDate;
  @Column(name="maturedon_date")
  public Date maturedonDate;
  @Column(name="closedon_date")
  public Date closedonDate;
  @Column(name="closedon_userid")
  public Long closedonUserid;
  @Column(name="total_charges_due_at_disbursement_derived")
  public BigDecimal totalChargesDueAtDisbursementDerived;
  @Column(name="principal_disbursed_derived")
  public BigDecimal principalDisbursedDerived;
  @Column(name="principal_repaid_derived")
  public BigDecimal principalRepaidDerived;
  @Column(name="principal_writtenoff_derived")
  public BigDecimal principalWrittenOffDerived;
  @Column(name="principal_outstanding_derived")
  public BigDecimal principalOutstandingDerived;
  @Column(name="interest_charged_derived")
  public BigDecimal interestChargedDerived;
  @Column(name="interest_repaid_derived")
  public BigDecimal interestRepaidDerived;
  @Column(name="interest_waived_derived")
  public BigDecimal interestWaivedDerived;
  @Column(name="interest_writtenoff_derived")
  public BigDecimal interestWrittenOffDerived;
  @Column(name="interest_outstanding_derived")
  public BigDecimal interestOutstandingDerived;
  @Column(name="fee_charges_charged_derived")
  public BigDecimal feeChargesChargedDerived;
  public BigDecimal feeChargesRepaidDerived;
  @Column(name="fee_charges_waived_derived")
  public BigDecimal feeChargesWaivedDerived;
  @Column(name="fee_charges_writtenoff_derived")
  public BigDecimal feeChargesWrittenOffDerived;
  @Column(name="fee_charges_outstanding_derived")
  public BigDecimal feeChargesOutstandingDerived;
  @Column(name="penalty_charges_charged_derived")
  public BigDecimal penaltyChargesChargedDerived;
  @Column(name="penalty_charges_repaid_derived")
  public BigDecimal penaltyChargesRepaidDerived;
  @Column(name="penalty_charges_waived_derived")
  public BigDecimal penaltyChargesWaivedDerived;
  @Column(name="penalty_charges_writtenoff_derived")
  public BigDecimal penaltyChargesWrittenOffDerived;
  @Column(name="penalty_charges_outstanding_derived")
  public BigDecimal PenaltyChargesOutstandingDerived;
  @Column(name="total_expected_repayment_derived")
  public BigDecimal totalExpectedRepaymentDerived;
  @Column(name="total_repayment_derived")
  public BigDecimal totalRepaymentDerived;
  @Column(name="total_expected_costofloan_derived")
  public BigDecimal totalExpectedCostofloanDerived;
  @Column(name="total_costofloan_derived")
  public BigDecimal totalCostofloanDerived;
  @Column(name="total_waived_derived")
  public BigDecimal totalWaivedDerived;
  @Column(name="total_writtenoff_derived")
  public BigDecimal totalWrittenoffDerived;
  @Column(name="total_outstanding_derived")
  public BigDecimal totalOutstandingDerived;
  @Column(name="total_overpaid_derived")
  public BigDecimal totalOverpaidDerived;
  @Column(name="rejectedon_date")
  public Date rejectedonDate;
  @Column(name="rejectedon_userid")
  public Long rejectedonUserid;
  @Column(name="rescheduledon_date")
  public Date rescheduledonDate;
  @Column(name="rescheduledon_userid")
  public Long rescheduledonUserid;
  @Column(name="withdrawnon_date")
  public Date withdrawnonDate;
  @Column(name="withdrawnon_userid")
  public Long withdrawnonUserid;
  @Column(name="writtenoffon_date")
  public Date writtenoffonDate;
  @Column(name="loan_transaction_strategy_id")
  public Long loanTransactionStrategyId;
  @Column(name="sync_disbursement_with_meeting")
  public Boolean syncDisbursementWithMeeting;
  @Column(name="loan_counter")
  public Short loanCounter;
  @Column(name="loan_product_counter")
  public Short loanProductCounter;
  @Column(name="fixed_emi_amount")
  public BigDecimal fixedEmiAmount;
  @Column(name="max_outstanding_loan_balance")
  public BigDecimal maxOutstandingLoanBalance;
  @Column(name="grace_on_arrears_ageing")
  public Short graceOnArrearsAgeing;
  @Column(name="is_npa")
  public Boolean isNpa;
  @Column(name="total_recovered_derived")
  public BigDecimal totalRecoveredDerived;
  @Column(name="accrued_till")
  public Date accruedTill;
  @Column(name="interest_recalcualated_on")
  public Date interestRecalcualatedOn;
  @Column(name="days_in_month_enum")
  public Short daysInMonthEnum;
  @Column(name="days_in_year_enum")
  public Short daysInYearEnum;
  @Column(name="interest_recalculation_enabled")
  public Boolean interestRecalculationEnabled;
  @Column(name="guarantee_amount_derived")
  public BigDecimal guaranteeAmountDerived;
  @Column(name="create_standing_instruction_at_disbursement")
  public Boolean createStandingInstructionAtDisbursement;
  @Column(name="version")
  public Integer version;
  @Column(name="writeoff_reason_cv_id")
  public Integer writeoffReasonCvId;
  @Column(name="loan_sub_status_id")
  public Short loanSubStatusId;
  @Column(name="is_topup")
  public Boolean isTopUp;
  @Column(name="is_equal_amortization")
  public Boolean isEqualAmortization;
  @Column(name="fixed_principal_percentage_per_installment")
  public BigDecimal fixedPrincipalPercentagePerInstallment;
  @Column(name="created_on_utc")
  public OffsetDateTime createdOnUtc;
  @Column(name="created_by")
  public Integer createdBy;
  @Column(name="last_modified_by")
  public Integer lastModifiedBy;

  @Column(name="last_modified_on_utc")
  public LocalDateTime lastModifiedOnUtc;

}
