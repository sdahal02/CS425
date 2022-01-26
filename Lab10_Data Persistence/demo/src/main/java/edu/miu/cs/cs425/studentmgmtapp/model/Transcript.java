package edu.miu.cs.cs425.studentmgmtapp.model;

import java.util.Objects;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class Transcript {
	private String transcriptId;
	private String degreeTitle;

	public Transcript() {
		
		
	}

	public Transcript(@NotNull String transcriptId, @NotNull String degreeTitle) {
		super();
		this.transcriptId = transcriptId;
		this.degreeTitle = degreeTitle;
	}

	public String getTranscriptId() {
		return transcriptId;
	}

	public String getDegreeTitle() {
		return degreeTitle;
	}

	@Override
	public int hashCode() {
		return Objects.hash(degreeTitle, transcriptId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transcript other = (Transcript) obj;
		return Objects.equals(degreeTitle, other.degreeTitle) && Objects.equals(transcriptId, other.transcriptId);
	}

	@Override
	public String toString() {
		return String.format("Transcript [transcriptId=%s, degreeTitle=%s]", transcriptId, degreeTitle);
	}
	
	

}
