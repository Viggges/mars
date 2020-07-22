package com.thoughtworks.MarsRover;

import org.junit.Test;


public class MarsRoverTest {

    @Test
    public void should_return_0_4_N_given_MMMM_init_00N() {

        Position position = new Position(0,0,Direction.NORTH);
        String cmd = "MMMM";
        String expect = "(0,4)N";

        this.should_return_expect_given_cmd_init(expect,cmd,position);
    }

    @Test
    public void should_return_0_0_N_given_LLLL_init_00N() {

        Position position = new Position(0,0,Direction.NORTH);
        String cmd = "LLLL";
        String expect = "(0,0)N";

        this.should_return_expect_given_cmd_init(expect,cmd,position);
    }

    @Test
    public void should_return__2_1_N_given_MLMMR_init_00N() {

        Position position = new Position(0,0,Direction.NORTH);
        String cmd = "MLMMR";
        String expect = "(-2,1)N";

        this.should_return_expect_given_cmd_init(expect,cmd,position);
    }

    @Test
    public void should_return_1_0_N_given_M_init_00N() {

        Position position = new Position(0,0,Direction.NORTH);
        String cmd = "M";
        String expect = "(0,1)N";

        this.should_return_expect_given_cmd_init(expect,cmd,position);
    }

    @Test
    public void should_return_0_0_W_given_L_init_00N() {

        Position position = new Position(0,0,Direction.NORTH);
        String cmd = "L";
        String expect = "(0,0)W";

        this.should_return_expect_given_cmd_init(expect,cmd,position);
    }

    @Test
    public void should_return_0_0_E_given_R_init_00N() {

        Position position = new Position(0,0,Direction.NORTH);
        String cmd = "R";
        String expect = "(0,0)E";

        this.should_return_expect_given_cmd_init(expect,cmd,position);
    }


    @Test
    public void should_return__1_0_E_given_M_init_00E() {

        Position position = new Position(0,0,Direction.EAST);
        String cmd = "M";
        String expect = "(1,0)E";

        this.should_return_expect_given_cmd_init(expect,cmd,position);
    }

    @Test
    public void should_return_0_0_N_given_L_init_00E() {
        Position position = new Position(0,0,Direction.EAST);

        String cmd = "L";

        String expect = "(0,0)N";

        this.should_return_expect_given_cmd_init(expect, cmd, position);
    }

    @Test
    public void should_return_0_0_S_given_R_init_00E() {

        Position position = new Position(0,0,Direction.EAST);
        String cmd = "R";

        String expect = "(0,0)S";

        this.should_return_expect_given_cmd_init(expect, cmd, position);
    }


    @Test
    public void should_return_0__1_S_given_M_init_00S() {

        Position position = new Position(0,0,Direction.SOUTH);
        String cmd = "M";
        String expect = "(0,-1)S";

        this.should_return_expect_given_cmd_init(expect, cmd, position);
    }

    @Test
    public void should_return_0_0_E_given_L_init_00S() {

        Position position = new Position(0,0,Direction.SOUTH);
        String cmd = "L";
        String expect = "(0,0)E";

        this.should_return_expect_given_cmd_init(expect, cmd, position);
    }

    @Test
    public void should_return_0_0_W_given_R_init_00S() {

        Position position = new Position(0,0,Direction.SOUTH);
        String cmd = "R";
        String expect = "(0,0)W";

        this.should_return_expect_given_cmd_init(expect, cmd, position);
    }


    @Test
    public void should_return__1_0_W_given_M_init_00W() {

        Position position = new Position(0,0,Direction.WEST);
        String cmd = "M";
        String expect = "(-1,0)W";

        this.should_return_expect_given_cmd_init(expect, cmd, position);
    }

    @Test
    public void should_return_0_0_S_given_L_init_00W() {

        Position position = new Position(0,0,Direction.WEST);
        String cmd = "L";
        String expect = "(0,0)S";

        this.should_return_expect_given_cmd_init(expect, cmd, position);
    }

    @Test
    public void should_return_0_0_N_given_R_init_00W() {

        Position position = new Position(0,0,Direction.WEST);
        String cmd = "R";
        String expect = "(0,0)N";

        this.should_return_expect_given_cmd_init(expect, cmd, position);
    }


    // X,Y边界测试

    @Test
    public void should_return_0_4_W_given_MMMMMMMLLMR_init_00N() {

        Position position = new Position(0,0,Direction.NORTH);
        String cmd = "MMMMMMMLLMR";
        String expect = "(0,4)W";

        this.should_return_expect_given_cmd_init(expect, cmd, position);
    }

    @Test
    public void should_return_4_0_N_given_MMMMMMMLLMR_init_00E() {

        Position position = new Position(0,0,Direction.EAST);
        String cmd = "MMMMMMMLLMR";
        String expect = "(4,0)N";

        this.should_return_expect_given_cmd_init(expect, cmd, position);
    }

    @Test
    public void should_return_0__4_E_given_MMMMMMMLLMR_init_00S() {

        Position position = new Position(0,0,Direction.SOUTH);
        String cmd = "MMMMMMMLLMR";
        String expect = "(0,-4)E";

        this.should_return_expect_given_cmd_init(expect, cmd, position);
    }

    @Test
    public void should_return__4_0_S_given_MMMMMMMLLMR_init_00W() {

        Position position = new Position(0,0,Direction.WEST);
        String cmd = "MMMMMMMLLMR";
        String expect = "(-4,0)S";

        this.should_return_expect_given_cmd_init(expect, cmd, position);
    }

    @Test
    public void should_return_0__1_W_given_MBMMLMMBMM_init_00N() {

        Position position = new Position(0,0,Direction.NORTH);
        String cmd = "MBMMLMMBMM";
        String expect = "(0,-1)W";

        this.should_return_expect_given_cmd_init(expect, cmd, position);
    }


    private void should_return_expect_given_cmd_init(String expect, String cmd, Position position){

        MarsRover marsRover = new MarsRover();

        CommandChain commandChain = new CommandChain();

        Command moveCommand = new MoveCommand();
        Command baclCommand = new BackCommand();
        Command leftCommand = new LeftCommand();
        Command rightCommand = new RightCommand();

        commandChain.addCommand(moveCommand);
        commandChain.addCommand(baclCommand);
        commandChain.addCommand(leftCommand);
        commandChain.addCommand(rightCommand);


        marsRover.init(position.getX(),position.getY(),position.getDirection(), commandChain);

        String actual = marsRover.execute(cmd);

        assert expect.equals(actual);

    }
}