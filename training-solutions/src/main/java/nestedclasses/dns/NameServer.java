package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {

    private List<DnsEntry> dns = new ArrayList<>();

    public List<DnsEntry> getDns() {
        return dns;
    }

    public void addEntry(String hostName, String hostIp) {
        if (dns.stream().anyMatch(o -> o.hostName == hostName || o.hostIp == hostIp)) {
            throw new IllegalArgumentException("Already exists");
        } else {
            dns.add(new DnsEntry(hostName, hostIp));
        }
    }

    public String getIpByName(String hostName) {
        return dns.stream().filter(o -> o.hostName == hostName).findFirst().orElseThrow(() -> new IllegalArgumentException("Element not found")).hostIp;
    }

    public String getNameByIp(String hostIp) {
        return dns.stream().filter(o -> o.hostIp == hostIp).findFirst().orElseThrow(() -> new IllegalArgumentException("Element not found")).hostName;
    }

    public void removeEntryByName(String hostName) {
        dns.stream().filter(o -> o.hostName == hostName).findFirst().ifPresent(erase -> dns.remove(erase));
    }

    public void removeEntryByIp(String hostIp) {
        dns.stream().filter(o -> o.hostIp == hostIp).findFirst().ifPresent(erase -> dns.remove(erase));
    }

    private static class DnsEntry {
        private String hostName;
        private String hostIp;

        public DnsEntry(String hostName, String hostIp) {
            this.hostName = hostName;
            this.hostIp = hostIp;
        }
    }
}
