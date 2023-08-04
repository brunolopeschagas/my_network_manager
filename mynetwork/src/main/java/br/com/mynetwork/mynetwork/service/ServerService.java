package br.com.mynetwork.mynetwork.service;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collection;

import br.com.mynetwork.mynetwork.model.Server;

public interface ServerService {
    Server create(Server server);
    Server ping(String ipAddress) throws UnknownHostException, IOException;
    Collection<Server> list(int limit);
    Server get(Long id);
    Server update(Server server);
    boolean delete(Long id);
}
