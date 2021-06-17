package com.klein.designpattern.adapter;

/**
 * @author Klein
 * @Classname Adapter
 * @Description 适配器
 * @Date 2021-06-17 10:57
 * @Created by Klein
 */
public class NewInterfaceAdapter implements NewInterface {

    private OldInterface oldInterface;

    public NewInterfaceAdapter(OldInterface oldInterface) {
        this.oldInterface = oldInterface;
    }

    @Override
    public void newExecute() {
        oldInterface.oldExecute();
    }
}
