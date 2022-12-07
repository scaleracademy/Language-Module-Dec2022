## Abstract vs Interface



```java

abstract class Storage {
	int pkStartFrom = 0;
	void store(List items)
	List retrieve()
	isEmpty() {
		return retrieve().size() < 1
	}
}

class NetworkStorage extends Storage {
	int pkStartFrom = 1;
	
	void store(List items) {
		// make http calls and store them on the server
	}
	List retrieve() {
		// make http calls and fetch the data from server
	}
}

class LocalStorage extends Storage {
	void store(List items) {
		// make File/IO calls and store on disk
	}
	List retrieve() {
		// make File/IO calls and read from disk
	}
}



class Database {
	Storage storage
	Database (Storage storage) {
		this.storage = storage
	}
	createTable() {
		storage.store(new Table())
	}
	queryTable(String tableName) {
		storage.retrieve().findFirst()... 
	}
}

Database netDb = new Database(new NetworkStorage())
Database localDb = new Database(new LocalStorage())






```