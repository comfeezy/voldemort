package voldemort.utils;

import java.io.File;
import java.util.Collection;

public interface VoldemortClusterStopper {

    public void stop(Collection<String> hostNames,
                     String hostUserId,
                     File sshPrivateKey,
                     String voldemortRootDirectory) throws VoldemortStartClusterException;

}