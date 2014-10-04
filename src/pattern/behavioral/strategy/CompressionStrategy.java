package pattern.behavioral.strategy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public interface CompressionStrategy {
	public void compressFiles(List<File> fileList);
}
