package Entity;

public class program extends bolumm{
private String program_id;
private String program_adi;
private bolumm bolum;
public program() {

}

@Override
void cekmek() {
System.out.println("program:cekmek()metodu");
}

public program(String program_id,String program_adi, Entity.bolumm bolum) {
	this.program_id = program_id;
	
	this.program_adi = program_adi;
	this.bolum = bolum;
}
public String getProgram_id() {
	return program_id;
}
public void setProgram_id(String program_id) {
	this.program_id = program_id;
}

public String getProgram_adi() {
	return program_adi;
}
public void setProgram_adi(String program_adi) {
	this.program_adi = program_adi;
}
public bolumm getBolum() {
	return bolum;
}
public void setBolum(bolumm bolum) {
	this.bolum = bolum;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((program_id == null) ? 0 : program_id.hashCode());
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
	program other = (program) obj;
	if (program_id == null) {
		if (other.program_id != null)
			return false;
	} else if (!program_id.equals(other.program_id))
		return false;
	return true;
}


}
