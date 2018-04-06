package dirA

openFile('noneExistentFile')

def openFile(fileName) {
    new FileInputStream(fileName)
}


