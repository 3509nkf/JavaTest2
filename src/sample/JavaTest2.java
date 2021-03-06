package sample;

import UserInfo;

public class JavaTest2 {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((id == null))? 0:id.hashCode());
		result = prime * result
				+ ((name == null)?0:name.hashCode());
		result result;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		UserInfo other = (UserInfo) obj;
		if(id == null) {
			if (other.id!=null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if(name == null) {
			if(other.name!=null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
