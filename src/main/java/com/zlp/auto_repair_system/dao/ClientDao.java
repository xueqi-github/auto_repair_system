package com.zlp.auto_repair_system.dao;

import com.zlp.auto_repair_system.mapper.ClientMapper;
import com.zlp.auto_repair_system.pojo.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 19:18
 * Description:张立朋，写点注释吧!!
 */
@Repository
public class ClientDao {

    @Autowired
    private ClientMapper clientMapper;

    //添加客户信息
    public Integer addClient(Client client){
        return clientMapper.insert(client);
    }

    //批量添加客户
    public Integer addClientList(List<Client> clientList){
        return clientMapper.insertList(clientList);
    }

    //更新客户信息
    public Integer updateClient(Client client){
        return clientMapper.updateByPrimaryKeySelective(client);
    }

    //批量更新客户信息
    public Integer updateClientList(List<Client> clientList){
        return clientMapper.updateClientList(clientList);
    }

    //通过id进行查询
    public Client findClientById(Integer id){
        return clientMapper.selectByPrimaryKey(id);
    }

    //查找所有客户信息
    public List<Client> getAllClient(){
        return clientMapper.selectAll();
    }

    //删除客户信息
    public Integer deleteClient(Integer id){
        return clientMapper.deleteByPrimaryKey(id);
    }

    //批量删除客户
    public Integer deleteClientList(List<Integer> ids){
        Example example = new Example(Client.class);
        example.createCriteria().andIn("id",ids);
        return clientMapper.deleteByExample(example);
    }

    //客户登录验证
    public Client ClientLogin(String clientName,String passWord){
        Example example = new Example(Client.class);
        example.createCriteria().andEqualTo(clientName).andEqualTo(passWord);
        return clientMapper.selectByPrimaryKey(example);
    }
}
