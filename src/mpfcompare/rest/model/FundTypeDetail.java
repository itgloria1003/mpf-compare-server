package mpfcompare.rest.model;

public class FundTypeDetail {

	private String fundType ; 
	private String investObjective;
	private String investInstruments; 
	private String riskLevel; 
	private Integer riskLevelScore;
	private String majorRisk;
	private String feature;
	public String getFundType() {
		return fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}
	public String getInvestObjective() {
		return investObjective;
	}
	public void setInvestObjective(String investObjective) {
		this.investObjective = investObjective;
	}
	public String getInvestInstruments() {
		return investInstruments;
	}
	public void setInvestInstruments(String investInstruments) {
		this.investInstruments = investInstruments;
	}
	public String getRiskLevel() {
		return riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}
	public Integer getRiskLevelScore() {
		return riskLevelScore;
	}
	public void setRiskLevelScore(Integer riskLevelScore) {
		this.riskLevelScore = riskLevelScore;
	}
	public String getMajorRisk() {
		return majorRisk;
	}
	public void setMajorRisk(String majorRisk) {
		this.majorRisk = majorRisk;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	} 
	
	
}
