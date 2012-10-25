package net.georgezeng.misterx.web;

import net.georgezeng.misterx.app.service.RPCImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("GameSetting")
@RequestMapping(value = "/gs", method = { RequestMethod.GET })
public class GameSetting {

	@Autowired
	private RPCImpl rpc;

	@RequestMapping(value = "/reset")
	@ResponseBody
	public String resetGame() {
		rpc.resetGame();
		return "Reset Game OK!!!";
	}
}
