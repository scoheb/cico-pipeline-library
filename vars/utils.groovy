import org.centos.Utils

class utils implements Serializable {
/**
 * Library to prepend 'env.' to the keys in source file and write them in a format of env.key=value in the destination file.
 * @param sourceFile - The file to read from
 * @param destinationFile - The file to write to; defaults to sourceFile, resulting in overwriting the source file.
 * @return
 */
    def convertProps(String sourceFile, String destinationFile = "${sourceFile}.groovy") {
        utils.convertProps(sourceFile, destinationFile)
    }

}