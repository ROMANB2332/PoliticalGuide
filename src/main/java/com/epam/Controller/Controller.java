package com.epam.Controller;

import com.epam.Model.BusinessLogic;
import com.epam.Model.IModel;
import com.epam.Model.Schema;

public class Controller implements IController {

    private IModel schema;

    public Controller(){
        schema = new BusinessLogic();
    }
    @Override
    public String startSpeech() {
        return schema.startSpeech();
    }

    @Override
    public String continiueSpeech() {
        return schema.continiueSpeech();
    }

    @Override
    public String convince() {
        return schema.convince();
    }

    @Override
    public String callLoathing() {
        return schema.callLoathing();
    }

    @Override
    public String endSpeech() {
        return schema.endSpeech();
    }
}
