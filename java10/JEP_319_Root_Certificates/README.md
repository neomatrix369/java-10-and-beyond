### JEP 319: Root Certificates

Run the below command, and enter the password as shown below:

```bash
$ keytool -cacerts -list | grep "Certificate"
Enter keystore password:  changeit    <== default password to the keystore   
```

The program should output something like the below:

```bash
Certificate fingerprint (SHA-256): 3A:43:E2:20:FE:7F:3E:A9:65:3D:1E:21:74:2E:AC:2B:75:C2:0F:D8:98:03:05:BC:50:2C:AF:8C:2D:9B:41:A1
Certificate fingerprint (SHA-256): 7E:37:CB:8B:4C:47:09:0C:AB:36:55:1B:A6:F4:5D:B8:40:68:0F:BA:16:6A:95:2D:B1:00:71:7F:43:05:3F:C2
Certificate fingerprint (SHA-256): 23:99:56:11:27:A5:71:25:DE:8C:EF:EA:61:0D:DF:2F:A0:78:B5:C8:06:7F:4E:82:82:90:BF:B8:60:E8:4B:3C
Certificate fingerprint (SHA-256): 55:2F:7B:DC:F1:A7:AF:9E:6C:E6:72:01:7F:4F:12:AB:F7:72:40:C7:8E:76:1A:C2:03:D1:D9:D2:0A:C8:99:88
Certificate fingerprint (SHA-256): CB:B5:AF:18:5E:94:2A:24:02:F9:EA:CB:C0:ED:5B:B8:76:EE:A3:C1:22:36:23:D0:04:47:E4:F3:BA:55:4B:65
Certificate fingerprint (SHA-256): 30:D0:89:5A:9A:44:8A:26:20:91:63:55:22:D1:F5:20:10:B5:86:7A:CA:E1:2C:78:EF:95:8F:D4:F4:38:9F:2F
Certificate fingerprint (SHA-256): 6F:FF:78:E4:00:A7:0C:11:01:1C:D8:59:77:C4:59:FB:5A:F9:6A:3D:F0:54:08:20:D0:F4:B8:60:78:75:E5:8F
[...snipped...]
```
About 80+ certificates should be displayed.

Compare the CA names mentioned on [JEP 319](http://openjdk.java.net/jeps/319) with above output. 
