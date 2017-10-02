package saferefactor.experiments.scp2013;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import saferefactor.core.Report;

class Result {
	private String subject;
	private Map<String, List<Report>> techniqueReports = new HashMap<String, List<Report>>();
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Map<String, List<Report>> getTechniqueReports() {
		return techniqueReports;
	}
	public void setTechniqueReports(Map<String, List<Report>> techniqueReports) {
		this.techniqueReports = techniqueReports;
	}
}