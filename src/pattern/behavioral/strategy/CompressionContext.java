package pattern.behavioral.strategy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CompressionContext {
	private CompressionStrategy strategy;

	public void setStrategy(CompressionStrategy strategy) {
		this.strategy = strategy;
	}  
	public void createArchive(List<File> files){
		strategy.compressFiles(files);
	}
}
