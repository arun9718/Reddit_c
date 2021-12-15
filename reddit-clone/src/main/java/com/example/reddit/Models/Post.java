package com.example.reddit.Models;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.validation.constraints.NotBlank;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name="Posts")
public class Post {
	
	//Primary Key of Posts Table
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long postId;
	 
	 
	 //postname column
	 @NotBlank(message = "Post Name cannot be empty or Null")
	 private String postName;
	 
	 @Nullable
	 private String url;
	 
	 @Nullable
	 @Lob
	 private String description;
	 
	 
	 private Integer voteCount = 0;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="user_id",referencedColumnName = "user_id")
	 private User user;
	 
	 
	 private Instant createdDate;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "id", referencedColumnName = "id")
	 private Subreddit subreddit;
}
