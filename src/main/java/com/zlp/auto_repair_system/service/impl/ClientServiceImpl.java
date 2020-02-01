package com.zlp.auto_repair_system.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zlp.auto_repair_system.dao.ClientDao;
import com.zlp.auto_repair_system.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 19:33
 * Description:张立朋，写点注释吧!!
 */
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDao clientDao;

    @Override
    public Integer addClient(Client client) {
        return clientDao.addClient(client);
    }

    @Override
    public Integer addClientList(List<Client> clientList) {
        return clientDao.addClientList(clientList);
    }

    @Override
    public Client findClientById(Integer id) {
        return clientDao.findClientById(id);
    }

    @Override
    public List<Client> getAllClient(Integer pageSize, Integer pageNumber) {
        PageHelper.startPage(pageSize,pageNumber);
        List<Client> all = clientDao.getAllClient();
        PageInfo<Client> clientPageInfo = new PageInfo<>(all);
        return clientPageInfo.getList();
    }

    @Override
    public Integer updateClient(Client client) {
        return clientDao.updateClient(client);
    }

    @Override
    public Integer updateClientList(List<Client> clientList) {
        return clientDao.updateClientList(clientList);
    }

    @Override
    public Integer deleteClientById(Integer id) {
        return clientDao.deleteClient(id);
    }

    @Override
    public Integer deleteClientList(List<Integer> ids) {
        return clientDao.deleteClientList(ids);
    }
}
