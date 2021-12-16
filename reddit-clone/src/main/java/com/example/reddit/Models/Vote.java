package com.example.reddit.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vote implements VoteType {
	private User user;
	private Post post;
	private boolean voteType;

}
